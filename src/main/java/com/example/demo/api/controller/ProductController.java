package com.example.demo.api.controller;



import com.example.demo.api.bean.Product;


import com.example.demo.api.service.ProductService;
import com.example.demo.api.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@RestController
//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用,
// 返回json数据不需要在方法前面加@ResponseBody注解了，但使用@RestController这个注解，就不能返回jsp,html页面，
// 视图解析器无法解析jsp,html页面
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){

        return productService.getProducts();
    }
    @PostMapping("/add/{name}/{price}")
    public String createProduct(@PathVariable String name,@PathVariable Double price){
        return productService.creatProduct(name,price);
    }
    @PutMapping("/update/{id}/{name}/{price}")
    public String updateProduct(@PathVariable Integer id,@PathVariable String name,@PathVariable Double price){
        return productService.updateProduct(id,name,price);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteById(id);
    }

}