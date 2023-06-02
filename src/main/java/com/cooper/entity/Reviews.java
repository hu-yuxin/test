package com.cooper.entity;

public class Reviews {
    private Integer id;
    private String content;
    private Integer reviewStu;
    private String theme;
    private Integer status;
    private String time;
    private Integer goodNumber;


    public Reviews() {
    }

    public Reviews(Integer id, String content, Integer reviewStu, String theme, Integer status, String time, Integer goodNumber) {
        this.id = id;
        this.content = content;
        this.reviewStu = reviewStu;
        this.theme = theme;
        this.status = status;
        this.time = time;
        this.goodNumber = goodNumber;
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
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取
     * @return reviewStu
     */
    public Integer getReviewStu() {
        return reviewStu;
    }

    /**
     * 设置
     * @param reviewStu
     */
    public void setReviewStu(Integer reviewStu) {
        this.reviewStu = reviewStu;
    }

    /**
     * 获取
     * @return theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 设置
     * @param theme
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * 获取
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取
     * @return goodNumber
     */
    public Integer getGoodNumber() {
        return goodNumber;
    }

    /**
     * 设置
     * @param goodNumber
     */
    public void setGoodNumber(Integer goodNumber) {
        this.goodNumber = goodNumber;
    }

    public String toString() {
        return "Reviews{id = " + id + ", content = " + content + ", reviewStu = " + reviewStu + ", theme = " + theme + ", status = " + status + ", time = " + time + ", goodNumber = " + goodNumber + "}";
    }
}
