package com.koukay.shardingjdbc.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 响应结果类
 */
@Data
@ToString
public class ResponseModel implements Serializable {
    //消息
    private String message;
    //状态码
    private int messageCode;
    //结果
    private Object result;

    public ResponseModel(String message, int messageCode, Object result) {
        this.message = message;
        this.messageCode = messageCode;
        this.result = result;
    }

    public ResponseModel() {
    }
}
