package com.cooper.controller.utils;

import lombok.Data;

@Data
public class Result {
    private Integer id;
    private Boolean flag;
    private Object data;
    private String msg;

    public Result(){

    }

    public Result(Boolean flag,Integer id,String msg){
        this.flag = flag;
        this.id = id;
        this.msg = msg;
    }

    //请求发送失败
    public Result(Boolean flag){
        this.flag = flag;
    }

    //请求发送成功并且有数据返回
    public Result(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    //请求发送成功但无数据返回
    public Result(Boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public Result(String msg){
        this.msg = msg;
    }
}
