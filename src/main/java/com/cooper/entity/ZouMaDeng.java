package com.cooper.entity;

public class ZouMaDeng {
    private Integer id;
    private String picUrl;


    public ZouMaDeng() {
    }

    public ZouMaDeng(Integer id, String picUrl) {
        this.id = id;
        this.picUrl = picUrl;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return picUrl
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置
     * @param picUrl
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String toString() {
        return "ZouMaDeng{id = " + id + ", picUrl = " + picUrl + "}";
    }
}
