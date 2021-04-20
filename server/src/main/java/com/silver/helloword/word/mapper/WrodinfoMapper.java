package com.silver.helloword.word.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.silver.helloword.word.entity.Wrodinfo;

import org.apache.ibatis.annotations.Mapper;

/**
 * (wd_wrodinfo)表数据库访问层
 *
 * @author sirmteam
 * @date 2021-04-20 16:32:24
 */
@Mapper
public interface WrodinfoMapper extends BaseMapper<Wrodinfo> {

}