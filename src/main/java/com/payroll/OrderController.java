package com.payroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
class OrderController {



    @Autowired
    private OrderLineService orderlineService = new OrderLineServiceImpl();

    @Autowired
    private OrderService orderService = new OrderServiceImpl();


    @GetMapping("/order/getall")
    List<Order> all() {
        return orderService.getAll();
    }

    @GetMapping("/order/get")
    Order all(@RequestBody Long id) {
        return orderService.getById(id);
    }

    @PostMapping("/order/add")
    Order add(@RequestBody Order newOrder){
        return orderService.add(newOrder);
    }

    @PutMapping("/order/edit")
    Order edit(@RequestBody Order newOrder){
        return orderService.add(newOrder);
    }

    @PostMapping("/order/addorderline")
    OrderLine addOrderLine(@RequestBody OrderLine newOrderLine){
        return orderlineService.addOrderLine(newOrderLine);
    }

    @DeleteMapping("/order/delete")
    void deleteOrder(@RequestBody Long id) {

        orderService.deleteById(id);
    }

    @GetMapping("/Order/getbyorder/")
    List<OrderLine> OrderLineById(@RequestBody Long id) {
        return orderlineService.getAllByOrder(id);
    }




    // Aggregate root
    /*
    @GetMapping("/employees")
    List<Order> all() {
        return repository.findAll();
    }
    @PutMapping("/employees/AddPhones/{id}")
    void AddPhone(@RequestBody OrderLine newOrderLine, @PathVariable Long id){
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
    List<OrderLine> getPhones(@PathVariable Long id) {
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