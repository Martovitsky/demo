package com.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public List<Goods> getAll() {
        return goodsRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
         goodsRepository.deleteById(id);
    }

    @Override
    public Goods findById(Long id) {  return goodsRepository.findById(id).orElse(null);}

    @Override
    public Goods add(Goods goods) {
       return goodsRepository.save(goods);
    }
}

