package payroll;

import java.util.List;

public interface OrderService {

    List<Order> getAll();

    Order getOneByName(String client);

    void deleteById(Long id);

    void add(Order order);

    //void setEmployeePhone(Long id, Order_Line orderLineNumber);

}
