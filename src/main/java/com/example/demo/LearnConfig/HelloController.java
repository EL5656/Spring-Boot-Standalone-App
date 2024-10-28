package com.example.demo.LearnConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //Configuration
    //1 - Value
    //2 - Environment

    @Value("${name}")
    private String studentName;

    @Value("${person.name}")
    private String studentName2;

    @Value("${address[1]}")
    private String address;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    @Autowired
    private Environment env;

    @RequestMapping("/hello")
    public String hello(){
        //need to refresh the page
        System.out.println(studentName);
        System.out.println(studentName2);
        System.out.println(address);
        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println("---------------------");
        System.out.println(env.getProperty("person.name"));
        return "hello";
    }


}
