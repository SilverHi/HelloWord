package com.silver.helloword.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.silver.helloword.common.entity.Session;
import com.silver.helloword.common.mapper.SessionMapper;
import com.silver.helloword.common.service.ISessionService;

import org.springframework.stereotype.Service;

/**
 * (um_session)表服务实现类
 *
 * @author sirmteam
 * @date 2021-04-19 17:14:26
 */
@Service
public class SessionServiceImpl extends ServiceImpl<SessionMapper, Session> implements ISessionService {

}