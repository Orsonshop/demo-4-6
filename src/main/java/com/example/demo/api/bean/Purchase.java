package com.example.demo.api.bean;

import javax.persistence.*;

import org.hibernate.validator.internal.constraintvalidators.bv.time.futureorpresent.FutureOrPresentValidatorForZonedDateTime;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table(name = "purchase")

public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Column
    private int number;

    @Column
    private  double price;

    @Column
    private  String name;

    @Column
    private  String time;

    @Column
    private  String factory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public Purchase(Integer id,String name,int number,double price,String factory,String time) {
        this.number = number;
        this.price = price;
        this.name = name;
        this.time = time;
        this.factory = factory;
        this.id=id;
    }

    public Purchase() {
    }

    public Purchase(String name, int number,double price,String factory,String time) {
        this.price = price;
        this.name = name;
        this.time = time;
        this.factory = factory;
        this.number=number;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", number=" + number +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", factory='" + factory + '\'' +
                '}';
    }
}
