package com.example.demo.LearnConfig1;

public class MyFirstClass {
private String myvar;

public  MyFirstClass(String myvar){
    this.myvar = myvar;
}
    public String sayHello() {
        return "Hello from MyFirstClass "+ myvar;
    }
}
