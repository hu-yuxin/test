package com.cooper.utils;

import java.util.List;

//这是第二个版本
public class PageBean<T>{
    private List<T> rows;
    private Integer totalNum;


    public PageBean() {
    }

    public PageBean(List<T> rows, Integer totalNum) {
        this.rows = rows;
        this.totalNum = totalNum;
    }

    /**
     * 获取
     * @return rows
     */
    public List<T> getRows() {
        return rows;
    }

    /**
     * 设置
     * @param rows
     */
    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    /**
     * 获取
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    /**
     * 设置
     * @param totalNum
     */
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public String toString() {
        return "PageBean{rows = " + rows + ", totalNum = " + totalNum + "}";
    }
}
