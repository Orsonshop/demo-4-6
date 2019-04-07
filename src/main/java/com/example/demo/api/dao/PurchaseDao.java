package com.example.demo.api.dao;


import com.example.demo.api.bean.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository  //创建实例对象，标注数据访问dao组件
public interface PurchaseDao extends JpaRepository<Purchase,Integer> {


}
