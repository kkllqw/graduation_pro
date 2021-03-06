package com.jxy.graduation_pro.utils.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum  ResultCode {

    //
    OPERATION_FAILURE(404,"操作失败"),
    //成功
    SUCCESS(200,"成功"),
    //失败
    FAIL(500,"失败"),

    //未登录
    NOT_LOGIN_FAIL(500506,"未登录"),
    //操作超时
    OPERATION_TIMEOUT(500600,"操作超时"),
    LIMITED_AUTHORITY(500507,"没有权限"),

    //上传图片
    PICTURE_DATA_FAIL(404100,"图片格式不正确"),
    //所有set数据不存在返回值
    PARAM_EMPTY(404003,"参数为空"),
    DATA_FAIL(404001,"数据不存在"),
    DATA_ALREADY_EXISTED(404402,"数据已存在");






    private Integer code;    //结果的号码
    private String message;   //结果的信息


}
