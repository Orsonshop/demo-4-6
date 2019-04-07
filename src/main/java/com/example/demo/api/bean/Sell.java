package com.example.demo.api.bean;

import javax.persistence.*;



@Entity
@Table(name = "sell")

public class Sell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private  String name;


    @Column
    private  int number;

    @Column
    private  String time;


    @Column
    private  double price;

    @Column
    private  String guest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public Sell(int number, double price, String name, String time, String guest) {
        this.number = number;
        this.price = price;
        this.name = name;
        this.time = time;
        this.guest=guest;
    }


    public Sell(double price, String name, String time, String guest) {
        this.price = price;
        this.name = name;
        this.time = time;
        this.guest=guest;
    }
}
