package com.payroll;


import java.util.List;

public interface OrderService {

    List<Order> getAll();

    void deleteById(Long id);

    Order add(Order order);

    Order getById(Long id);

}
