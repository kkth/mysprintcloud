package com.hk.cfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kunhe on 1/15/18.
 */
@SpringBootApplication
@EnableConfigServer // 激活该应用为配置文件服务器：读取远程配置文件，转换为rest接口服务
public class TheApplication {

    public static void main(String[] args) {
        args = new String[1];
        args[0] = "--spring.profiles.active=gitsimple";
        SpringApplication.run(TheApplication.class, args);
    }
}
