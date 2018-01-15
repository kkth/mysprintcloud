package com.hk.theservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kunhe on 1/15/18.
 */
@Configuration
@ConfigurationProperties(prefix = "simple.config" ,ignoreUnknownFields = false)
public class SimpleConfig {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "name="+name+" | age=" + age;
    }
}
