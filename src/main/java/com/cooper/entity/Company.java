package com.cooper.entity;

public class Company {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String descripe;
    private String phone;
    private Integer state;
    private Integer companyTea;
    private String type;
    public Company() {
    }

    public Company(Integer id, String name, String username, String password, String descripe, String phone, Integer state, Integer companyTea) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.descripe = descripe;
        this.phone = phone;
        this.state = state;
        this.companyTea = companyTea;
    }

    public Company(Integer id, String name, String username, String password, String descripe, String phone, Integer state, Integer companyTea, String type) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.descripe = descripe;
        this.phone = phone;
        this.state = state;
        this.companyTea = companyTea;
        this.type = type;
    }

    public Company(All all) {
        this.name = all.getName();
        this.username = all.getUsername();
        this.password = all.getPassword();
        this.descripe = all.getDescripe();
        this.phone = all.getPhone();
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return descripe
     */
    public String getDescripe() {
        return descripe;
    }

    /**
     * 设置
     * @param descripe
     */
    public void setDescripe(String descripe) {
        this.descripe = descripe;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取
     * @return companyTea
     */
    public Integer getCompanyTea() {
        return companyTea;
    }

    /**
     * 设置
     * @param companyTea
     */
    public void setCompanyTea(Integer companyTea) {
        this.companyTea = companyTea;
    }

    public String toString() {
        return "Company{id = " + id + ", name = " + name + ", username = " + username + ", password = " + password + ", descripe = " + descripe + ", phone = " + phone + ", state = " + state + ", companyTea = " + companyTea + "}";
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}