package com.silver.helloword.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.silver.helloword.user.entity.Userinfo;

import org.apache.ibatis.annotations.Mapper;


/**
 * (um_userinfo)表数据库访问层
 *
 * @author sirmteam
 * @date 2021-04-15 15:59:05
 */
@Mapper
public interface UserinfoMapper extends BaseMapper<Userinfo> {

}