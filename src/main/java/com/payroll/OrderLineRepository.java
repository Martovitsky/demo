package com.payroll;

import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

}

