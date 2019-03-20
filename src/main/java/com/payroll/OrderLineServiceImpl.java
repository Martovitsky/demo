package com.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional(readOnly = true)
public class OrderLineServiceImpl implements OrderLineService {
    @Autowired
    private OrderLineRepository orderlineRepository;

    @Override
    public List<OrderLine> getAllByOrder(Long order_id) {

        List<OrderLine> orderLines = new ArrayList<>();

        for(OrderLine orderLine :orderlineRepository.findAll() ){

            if (orderLine.getOrder_id()==order_id){

                orderLines.add(orderLine);
            }
        }

        return orderLines;

    }

    @Override
    public List<OrderLine> getAll() {

        return orderlineRepository.findAll();
    }

    @Override
    @Transactional
    public OrderLine addOrderLine(OrderLine order_line) {
       return orderlineRepository.save(order_line);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        orderlineRepository.deleteById(id);
    }
}
