package com.jxy.graduation_pro.utils.result;

import lombok.Data;

//通用返回结果类
@Data
public class Result<T> {
    private  Integer code;
    private  String message;
    private  T data;   //未知类型对象


    //传入ResultCode，将传入ResultCode的属性值交给当前属性
    //为了以后返回Result信息的完善性，便捷。
    private void setResultCode(ResultCode resultCode) {
        code = resultCode.getCode();
        message = resultCode.getMessage();
    }
    //默认错误结果（  码，信息）
    //静态方法： 类名.方法名()
    //<T> 未知类型的声明，这里是 泛型方法
    //Result<T> 返回值类型
    public static <T> Result<T> failure(){
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.FAIL);
        return result;
    }

    //错误结果： 码、信息、对象
    public static <T> Result<T> failure(T data){
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.FAIL);
        result.setData(data);
        return result;
    }

    //自定义错误结果： 码、信息
    public static <T> Result<T> failure(ResultCode resultCode){
        Result<T> result = new Result<>();
        result.setResultCode(resultCode);
        return result;
    }

    //自定义错误结果： 码、信息、对象
    public static <T> Result<T> failure(ResultCode resultCode,T data){
        Result<T> result = new Result<>();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }

    //默认成功：码、信息
    public static <T> Result<T> success(){
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    //成功：码、信息、对象
    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }



}
