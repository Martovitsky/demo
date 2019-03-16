package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Order_LineRepository extends JpaRepository<Order_Line, Long> {

    //List<Order_Line> findByOrder(Order order);
    //Order_Line findByClient(String client);
    //Order findByD(Integer age);
}

