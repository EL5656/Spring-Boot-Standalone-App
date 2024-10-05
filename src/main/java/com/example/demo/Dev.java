package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired//field injection
    @Qualifier("laptop")
    private Laptop laptop;//instance variable

    //Constructor injection
//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//    }

    //setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }
    public void build(){
        laptop.compile();

        System.out.println("working on awesome project");
    }
}
