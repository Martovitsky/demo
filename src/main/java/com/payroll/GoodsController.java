package com.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods/getAll")
    public List<Goods> getAll() {
        return goodsService.getAll();
    }

    @PostMapping("/goods/add")
    public Goods add(@RequestBody Goods newGoods){
        return goodsService.add(newGoods);
    }

    @PutMapping("/goods/edit")
    public Goods edit(@RequestBody Goods newGoods){
        return goodsService.add(newGoods);
    }

    @GetMapping("/goods/get")
    public Goods findById(@RequestBody Long id) {
        return goodsService.findById(id);
    }

    @DeleteMapping("/goods/delete")
    public void delete(@RequestBody Long id) {
        goodsService.deleteById(id);
    }


}

