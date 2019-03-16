package payroll;

import java.util.List;

public interface Order_LineService {

    List<Order_Line> getAllByOrder(Long order_id);
    List<Order_Line> getAll();

    void addOrderLine(Order_Line order_line);


}

