package com.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional(readOnly = true)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order getById(Long id) {  return orderRepository.findById(id).get();}


    @Override
    @Transactional
    public void deleteById(Long id){
        orderRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Order add(Order order) {
        return orderRepository.save(order);
    }


}

