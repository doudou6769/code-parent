package com.doudou.code.bg.admin.core;

import com.didispace.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author DouDou
 * @date 2020/10/6
 * @Description
 */
@SpringBootApplication
@EnableSwagger2Doc
@MapperScan("com.doudou.code.bg.admin.core.dao")
public class BgAdminWebCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BgAdminWebCoreApplication.class, args);
    }

}
