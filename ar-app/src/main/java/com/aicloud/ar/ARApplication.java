package com.aicloud.ar;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by tfyomo@qq.com on 2019-01-21 14:48
 */
@EnableCaching
@SpringBootApplication
@EnableTransactionManagement
@EnableSwagger2Doc
@ComponentScan("com.aicloud")
@MapperScan("com.aicloud")
public class ARApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ARApplication.class,args);
    }
}
