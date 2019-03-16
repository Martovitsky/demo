package payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional(readOnly = true)
public class Order_LineServiceImpl implements Order_LineService {
    @Autowired
    private Order_LineRepository order_lineRepository;

    @Override
    public List<Order_Line> getAllByOrder(Long order_id) {

        List<Order_Line> orderLines = new ArrayList<>();

        for(Order_Line orderLine :order_lineRepository.findAll() ){

            if (orderLine.getOrder_id()==order_id){

                orderLines.add(orderLine);
            }
        }

        return orderLines;

    }

    @Override
    public List<Order_Line> getAll() {

        return order_lineRepository.findAll();
    }

    @Override
    @Transactional
    public void addOrderLine(Order_Line order_line) {
        order_lineRepository.save(order_line);
    }
}
