package com.hk.theservice;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * Created by kunhe on 1/15/18.
 */

@SpringBootApplication
@EnableDiscoveryClient // 通过eureka注册服务注册中
public class TheApplication {

    public static void main(String[] args) {
        // 如果读取远程服务器上读取配置文件，如果执行成功，会有如下打印信息：
        // Located property source: CompositePropertySource
        // [name='configService', propertySources=[MapPropertySource
        // [name='https://github.com/hryou0922/spring_cloud.git/cloudconfig/cloud-config-dev.properties']]]
        args = new String[1];
        args[0] = "--spring.profiles.active=simple";
        SpringApplication.run(TheApplication.class, args);
    }

    /**
     * 使用fastjson做为json的解析器
     * @return
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //  fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }
}
