package com.example.demo.api.service;


import com.example.demo.api.bean.Product;
import com.example.demo.api.bean.Purchase;
import com.example.demo.api.dao.ProductDao;
import com.example.demo.api.dao.PurchaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class  PurchaseService {
    @Autowired
    private PurchaseDao purchaseDao;

    public List<Purchase> getPurchases(){
        return purchaseDao.findAll();
    }
    public String creatPurchase(String name, int number,double price,String factory,String time){
        Purchase purchase = new Purchase(name,number,price,factory,time);
       purchaseDao.save(purchase);
        return "create success";
    }

    public String updatePurchase(Integer id,String name, int number,double price,String factory,String time){
        Purchase purchase = new Purchase(id,name,number,price,factory,time);
        purchaseDao.save(purchase);
        return "update success";
    }

    public String  deleteById(Integer id){
        purchaseDao.deleteById(id);
        return "selete success";
    }


}