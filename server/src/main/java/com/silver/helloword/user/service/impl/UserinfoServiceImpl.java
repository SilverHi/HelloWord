package com.silver.helloword.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.silver.helloword.user.entity.Userinfo;
import com.silver.helloword.user.mapper.UserinfoMapper;
import com.silver.helloword.user.service.IUserinfoService;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (um_userinfo)表服务实现类
 *
 * @author sirmteam
 * @date 2021-04-15 15:59:06
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {

    @Autowired
    private UserinfoMapper mapper;
}