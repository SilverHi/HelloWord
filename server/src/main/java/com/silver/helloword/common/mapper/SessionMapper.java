package com.silver.helloword.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.silver.helloword.common.entity.Session;

import org.apache.ibatis.annotations.Mapper;

/**
 * (um_session)表数据库访问层
 *
 * @author sirmteam
 * @date 2021-04-19 17:14:25
 */
@Mapper
public interface SessionMapper extends BaseMapper<Session> {

}