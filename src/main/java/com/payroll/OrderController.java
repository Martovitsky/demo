package com.payroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
class OrderController {
    @Autowired
    private OrderLineService orderlineService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/getall")
    public List<Order> all() {
        return orderService.getAll();
    }

    @GetMapping("/order/get")
    public Order all(@RequestBody Long id) {
        return orderService.getById(id);
    }

    @PostMapping("/order/add")
    public Order add(@RequestBody Order newOrder){
        return orderService.add(newOrder);
    }

    @PutMapping("/order/edit")
    public Order edit(@RequestBody Order newOrder){
        return orderService.add(newOrder);
    }

    @PostMapping("/order/addorderline")
    public OrderLine addOrderLine(@RequestBody OrderLine newOrderLine){
        return orderlineService.addOrderLine(newOrderLine);
    }

    @DeleteMapping("/order/delete")
    public void deleteOrder(@RequestBody Long id) {

        orderService.deleteById(id);
    }

}