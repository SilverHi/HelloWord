package com.silver.helloword.word.controller;

import com.silver.helloword.common.Exception.HttpStatusException;
import com.silver.helloword.common.entity.Result;
import com.silver.helloword.common.utills.HttpUtil;
import com.silver.helloword.common.utills.ResultUtil;
import com.silver.helloword.word.service.IWrodinfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * (wd_wrodinfo)表控制层
 *
 * @author sirmteam
 * @date 2021-04-20 16:32:26
 */
@RestController
@RequestMapping("/wrod")
public class WrodinfoController {
    /**
     * 服务对象
     */
    @Autowired
    private IWrodinfoService wrodinfoService;
    @PostMapping("/translation")
    public Result translation (@RequestParam("type") String type,@RequestParam("word") String word) {
        //
        String url = "http://translate.google.cn/translate_a/single?client=gtx&dt=t&dj=1&ie=UTF-8&sl=zh_CN&tl=ja&q=你好";
//        String url = "https://www.dancihu.com/search/m/jp/?q=计算y=0";
        try {
            String translation = HttpUtil.doGet(url, "translation");
            System.out.println(translation);
        } catch (HttpStatusException e) {
            e.printStackTrace();
        }
        return ResultUtil.success();
    }
    // TODO: 敬请期待
    }