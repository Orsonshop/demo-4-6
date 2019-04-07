package com.example.demo.api.controller;


import com.example.demo.api.bean.Purchase;
import com.example.demo.api.dao.PurchaseDao;
import com.example.demo.api.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用,
// 返回json数据不需要在方法前面加@ResponseBody注解了，但使用@RestController这个注解，就不能返回jsp,html页面，
// 视图解析器无法解析jsp,html页面
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @RequestMapping("/all")

    public List<Purchase> getAll(){

        return purchaseService.getPurchases();
    }

    @PostMapping("/add/{name}/{number}/{price}/{factory}/{time}")
    public String createPurchase(@PathVariable String name, @PathVariable int number,@PathVariable double price,@PathVariable String factory,@PathVariable String time){
        return purchaseService.creatPurchase(name,number,price,factory,time);
    }
    @PutMapping("/update/{id}/{name}/{number}/{price}/{factory}/{time}")
    public String updatePurchase(@PathVariable Integer id,@PathVariable String name, @PathVariable int number,@PathVariable double price,@PathVariable String factory,@PathVariable String time){
        return purchaseService.updatePurchase(id,name,number,price,factory,time);
    }
//
    @DeleteMapping("/delete/{id}")
    public void   deletePurchase(@PathVariable Integer id) {
        purchaseService.deleteById(id);
    }

}