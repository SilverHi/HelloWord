package com.silver.helloword.user.controller;

import com.silver.helloword.common.entity.Result;
import com.silver.helloword.common.utills.ResultUtil;
import com.silver.helloword.user.entity.Userinfo;
import com.silver.helloword.user.service.IUserinfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserLoginController
 * @Description 登录
 * @Author Tsui
 * @Date 2021/4/15 14:57
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserLoginController {
    private int count =1;
    private int count2 =1;
    /**
     * 服务对象
     */
    @Autowired
    private IUserinfoService userinfoService;
    @RequestMapping("/login")
    public Result login(){
        Userinfo userinfo = userinfoService.getBaseMapper().selectById(1);
        count++;
        System.out.println(count);
        return ResultUtil.success(userinfo);
    }
    //http://translate.google.cn/translate_a/single?client=gtx&dt=t&dj=1&ie=UTF-8&sl=ja&tl=zh_CN&q=calculate
    @RequestMapping("/login2")
    public Result login2(){
        Userinfo userinfo = userinfoService.getBaseMapper().selectById(1);
        count2++;
        System.out.println(count2);
        return ResultUtil.success(userinfo);
    }
}
