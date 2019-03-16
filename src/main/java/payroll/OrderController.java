package payroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
class OrderController {



    @Autowired
    private Order_LineService order_lineService = new Order_LineServiceImpl();

    @Autowired
    private OrderService orderService = new OrderServiceImpl();

    @Autowired
    private GoodsService goodsService = new GoodsServiceImpl();

    /*
    private final OrderService orderService;
    public OrderService_(OrderService orderService){
        this.orderService=orderService;
    }*/




    //EmployeeController(OrderRepository repository) {
       // this.repository = repository;
   // }

    @GetMapping("/employees")
    List<Order> all() {
        return orderService.getAll();
    }
    @PostMapping("/Order/Add")
    void Add(@RequestBody Order newOrder){
        orderService.add(newOrder);
    }
    @PostMapping("/Order_line/Add")
    void AddLine(@RequestBody Order_Line newOrder_line){
        order_lineService.addOrderLine(newOrder_line);
    }
    @GetMapping("/Order_line/get/{id}")
    List<Order_Line> OrderLineById(@PathVariable Long id) {
        return order_lineService.getAllByOrder(id);
    }
    @GetMapping("/Order_line/get/all")
    List<Order_Line> All() {
        return order_lineService.getAll();
    }

    @DeleteMapping("/orders/")
    void deleteOrder(@RequestBody Long id) {

        orderService.deleteById(id);
    }

    // Aggregate root
    /*
    @GetMapping("/employees")
    List<Order> all() {
        return repository.findAll();
    }
    @PutMapping("/employees/AddPhones/{id}")
    void AddPhone(@RequestBody Order_Line newOrderLine, @PathVariable Long id){
        System.out.println(newOrderLine +"   "+id);
        orderService.setEmployeePhone(id, newOrderLine);
    }

    @PostMapping("/employees")
    Order newEmployee(@RequestBody Order newOrder) {
        return repository.save(newOrder);
    }

    @GetMapping("/employees/findByName/")
    Order getOnebyName(@RequestBody String name) {

        return repository.findByName(name);

    }

    @GetMapping("/employees/summaryAge/")
    Integer getEmployeesAgeSummary() {
        return orderService.getEmployeesAgeSummary();
    }

    @GetMapping("/employees/Phone/{id}")
    List<Order_Line> getPhones(@PathVariable Long id) {
        return orderService.getEmployeePhones(id);
    }

    @GetMapping("/employees/findByAge/")
    Order getOneByAge(@RequestBody Integer age) {

        return orderService.getOneByAge(age);

    }

    @PutMapping("/employees/{id}")
    Order replaceEmployee(@RequestBody Order newOrder, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newOrder.getName());
                    employee.setRole(newOrder.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newOrder.setId(id);
                    return repository.save(newOrder);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }*/
}