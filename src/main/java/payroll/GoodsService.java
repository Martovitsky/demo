package payroll;

import java.util.List;


public interface GoodsService {

    List<Goods> getAll();

    void deleteById(Long id);

    void add(Goods goods);

    Goods editGoods(Goods goods);
    Goods findById(Long aLong);

    //void setEmployeePhone(Long id, Order_Line orderLineNumber);

}

