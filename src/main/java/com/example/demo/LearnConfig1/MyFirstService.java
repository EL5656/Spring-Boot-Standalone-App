package com.example.demo.LearnConfig1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {
    private MyFirstClass myFirstClass;
    private Environment env;

    @Value("${my.prop}")
    private String customProperty;

    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    @Autowired
    public void setEnv(Environment env) {
        this.env = env;
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public void setCustomProperty(String customProperty) {
        this.customProperty = customProperty;
    }

    //reading system properties
    public String getJavaVersion(){
        return env.getProperty("java.version");
    }

    public String getOsName(){
        return env.getProperty("os.name");
    }

    //read from application.properties
    public String readProp(){
        return env.getProperty("my.custom.property");
    }

    public String tellAStory(){
        return "the dependency is: "+ myFirstClass.sayHello();
    }
}
