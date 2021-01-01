package com.doudou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @author DouDou
 * @date 2021/1/1
 * @Description
 */
@MapperScan("com.doudou.mapper")
@SpringBootApplication
@ServletComponentScan
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityTestApplication.class,args);
    }

}
