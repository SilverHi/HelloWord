package com.silver.helloword.common.Exception;

import org.springframework.http.HttpStatus;

/**
 * @ClassName HttpStatusException
 * @Description TODO
 * @Author Tsui
 * @Date 2021/4/20 16:53
 * @Version 1.0
 **/

public class HttpStatusException extends Exception {

    private HttpStatus httpStatus;


    private String result;

    public HttpStatusException(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public HttpStatusException(HttpStatus httpStatus, String result) {
        this.httpStatus = httpStatus;

    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getResult() {
        return result;
    }
}
