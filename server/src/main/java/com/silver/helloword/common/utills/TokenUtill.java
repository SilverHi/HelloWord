package com.silver.helloword.common.utills;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.google.gson.Gson;
import com.silver.helloword.common.entity.Session;
import com.silver.helloword.common.entity.Token;
import com.silver.helloword.common.service.ISessionService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @ClassName TokenUtill
 * @Description TODO
 * @Author Tsui
 * @Date 2021/4/19 16:44
 * @Version 1.0
 **/

public class TokenUtill {
    private static String tokenKey = "silver";
    public static String createToken(String username) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sf.format(new Date());
        Token token = new Token();
        token.setUsername(username);
        token.setTime(time);
        token.setKey(tokenKey);
        Gson gson = new Gson();
        String s = gson.toJson(token);

        BaseMapper<Session> baseMapper = SpringFactoryUtil.getBean(ISessionService.class).getBaseMapper();
        QueryWrapper<Session> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Session::getUsername,username);
        Session session = baseMapper.selectOne(queryWrapper);
        if (session != null) {
            session.setTime(time);
            baseMapper.updateById(session);
        }else {
            session = new Session();
            session.setTime(time);
            session.setUsername(username);
            baseMapper.insert(session);
        }
        return AESUtill.encrypt(s);
    }

    public static Boolean checkToken(String tokenstr) {
        String decrypt = AESUtill.decrypt(tokenstr);
        if (decrypt != null) {
            Gson gson = new Gson();
            Token token = gson.fromJson(decrypt, Token.class);
            if (token != null && token.getKey().equals(tokenKey)) {
                BaseMapper<Session> baseMapper = SpringFactoryUtil.getBean(ISessionService.class).getBaseMapper();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                QueryWrapper<Session> queryWrapper = new QueryWrapper<>();
                queryWrapper.lambda().eq(Session::getUsername,token.getUsername());
                Session session = baseMapper.selectOne(queryWrapper);
                if (session!=null){
                    LocalDateTime startDate = LocalDateTime.parse(session.getTime(), formatter);
                    LocalDateTime endDate = LocalDateTime.now();
                    long between = ChronoUnit.SECONDS.between(startDate, endDate);
                    if (between<= 30*60) {
                        session.setTime(formatter.format(LocalDateTime.now()));
                        baseMapper.updateById(session);
                        //todo 更新session表
                        return true;
                    }
                }

            }
        }
        return false;
    }
}
