package com.payroll;

import java.util.List;


public interface GoodsService {

    List<Goods> getAll();

    void deleteById(Long id);

    Goods add(Goods goods);

    Goods findById(Long id);

}

