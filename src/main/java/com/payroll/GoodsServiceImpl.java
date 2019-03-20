package com.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public List<Goods> getAll() {
        return goodsRepository.findAll();
    }


    @Override
    @Transactional
    public void deleteById(Long id) {

         goodsRepository.deleteById(id);
    }

    @Override
    public Goods findById(Long id) {  return goodsRepository.findById(id).get();}

    /*@Override
    @Transactional
    public Goods editGoods(Goods goods){
        return goodsRepository.saveAndFlush(goods);
    }
    */

    @Override
    @Transactional
    public Goods add(Goods goods) {
       return goodsRepository.save(goods);
    }
}

