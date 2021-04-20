package com.silver.helloword.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.silver.helloword.common.entity.Result;
import com.silver.helloword.common.utills.ResultUtil;
import com.silver.helloword.common.utills.TokenUtill;
import com.silver.helloword.user.entity.Userinfo;
import com.silver.helloword.user.service.IUserinfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
    @PostMapping("/login")
    public Result login(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println(username+password);
        QueryWrapper<Userinfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Userinfo::getUsername,username);
        Userinfo userinfo = userinfoService.getBaseMapper().selectOne(queryWrapper);
        if (userinfo!=null){
            if (userinfo.getPassword().equals(password)) {
                userinfo.setPassword("");
                Map map = new HashMap();
                map.put("user",userinfo);
                map.put("token", TokenUtill.createToken(userinfo.getUsername()));
                return ResultUtil.success(map);
            }
        }
        return ResultUtil.error("这个账号密码不对哦~");
    }
    @RequestMapping("/checkUser")
    public Result login2(){
        return ResultUtil.success();
    }
}
