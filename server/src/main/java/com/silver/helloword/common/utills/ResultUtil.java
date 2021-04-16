package com.silver.helloword.common.utills;

import com.silver.helloword.common.entity.Result;

/**
 * @ClassName ResultUtil
 * @Description TODO
 * @Author Tsui
 * @Date 2021/4/15 15:07
 * @Version 1.0
 **/

public class ResultUtil {
    public static Result success(){
        Result result = new Result();
        result.setCode(200);
        return result;
    }
    public static Result success(Object t){
        Result result = new Result();
        result.setCode(200);
        result.setData(t);
        return result;
    }
    public static Result error(String message){
        Result result = new Result();
        result.setCode(500);
        result.setMessage(message);
        return result;
    }
}


