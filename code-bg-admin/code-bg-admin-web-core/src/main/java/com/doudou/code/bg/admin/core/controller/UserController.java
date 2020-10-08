package com.doudou.code.bg.admin.core.controller;

import com.doudou.code.bg.admin.core.constant.SystemStaticConst;
import com.doudou.code.bg.admin.core.entity.WebResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DouDou
 * @date 2020/10/6
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 功能描述：模拟实现用户登录
     * @param loginAccount 用户账号
     * @param loginPassword 用户密码
     * @return 返回登录结果
     */
    @ApiOperation(value = "实现用户登陆")
    @PostMapping("login")
    public WebResult login(@RequestParam(name = "loginAccount") String loginAccount, @RequestParam(name = "loginPassword") String loginPassword){
        Map<String,Object> result = new HashMap<>(1);
        result.put("token","token123");
        return new WebResult(SystemStaticConst.SUCCESS, "登陆成功",result);
    }

}