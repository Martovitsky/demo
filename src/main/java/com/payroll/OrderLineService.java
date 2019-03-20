package com.payroll;

import java.util.List;

public interface OrderLineService {

    List<OrderLine> getAllByOrder(Long order_id);
    List<OrderLine> getAll();
    void deleteById(Long id);
    OrderLine addOrderLine(OrderLine order_line);


}

