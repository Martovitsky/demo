package com.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

    //List<OrderLine> findByOrder(Order order);
    //OrderLine findByClient(String client);
    //Order findByD(Integer age);
}

