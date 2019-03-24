package com.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class OrderLineServiceImpl implements OrderLineService {
    @Autowired
    private OrderLineRepository orderlineRepository;

    @Override
    public OrderLine addOrderLine(OrderLine order_line) {
       return orderlineRepository.save(order_line);
    }

}
