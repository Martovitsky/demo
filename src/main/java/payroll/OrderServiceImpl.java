package payroll;

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
    public Order getOneByName(String client) {  return orderRepository.findByClient(client);}


    @Override
    public void deleteById(Long id){
        orderRepository.delete(orderRepository.findById(id).get());
    }

    @Override
    @Transactional
    public void add(Order order) {
        orderRepository.save(order);
    }
}

