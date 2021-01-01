package com.doudou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DouDou
 * @date 2021/1/1
 * @Description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String add(){
        return "hello security";
    }

    @GetMapping("/index")
    public String index(){
        return "this is index";
    }

}
