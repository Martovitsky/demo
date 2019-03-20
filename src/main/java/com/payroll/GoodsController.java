package com.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class GoodsController {


    @Autowired
    private GoodsService goodsService = new GoodsServiceImpl();

    @GetMapping("/goods/getAll")                   //return all goods       +
    List<Goods> getAll() {
        return goodsService.getAll();
    }

    @PostMapping("/goods/addOrEdit")                     //Adding new item        +
    Goods add(@RequestBody Goods newGoods){
        return goodsService.add(newGoods);
    }

    @PutMapping("/goods/edit")                     //Adding new item        +
    Goods edit(@RequestBody Goods newGoods){
        return goodsService.add(newGoods);
    }

    @GetMapping("/goods/get")                      //getting by ID          +
    Goods findById(@RequestBody Long id) {
        return goodsService.findById(id);
    }

    @DeleteMapping("/goods/delete")
    void deleteEmployee(@RequestBody Long id) {
        goodsService.deleteById(id);
    }


}

