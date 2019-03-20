package com.payroll;

import java.util.List;


public interface GoodsService {

    List<Goods> getAll();

    void deleteById(Long id);

    Goods add(Goods goods);

   // Goods editGoods(Goods goods);
    Goods findById(Long aLong);

    //void setEmployeePhone(Long id, OrderLine orderLineNumber);

}

