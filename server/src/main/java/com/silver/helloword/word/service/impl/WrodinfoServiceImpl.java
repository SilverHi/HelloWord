package com.silver.helloword.word.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.silver.helloword.word.entity.Wrodinfo;
import com.silver.helloword.word.mapper.WrodinfoMapper;
import com.silver.helloword.word.service.IWrodinfoService;

import org.springframework.stereotype.Service;

/**
 * (wd_wrodinfo)表服务实现类
 *
 * @author sirmteam
 * @date 2021-04-20 16:32:26
 */
@Service
public class WrodinfoServiceImpl extends ServiceImpl<WrodinfoMapper, Wrodinfo> implements IWrodinfoService {

}