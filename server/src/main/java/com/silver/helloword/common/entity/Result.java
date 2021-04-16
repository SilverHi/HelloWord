package com.silver.helloword.common.entity;

import lombok.Data;

/**
 * @ClassName Result
 * @Description TODO
 * @Author Tsui
 * @Date 2021/4/15 15:06
 * @Version 1.0
 **/
@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;
}
