package com.cooper.entity;

public class All {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String descripe;
    private String phone;
    private Integer state;
    private Integer companyTea;
    private String type;
    private String gender;
    private Integer age;
    private String grade;
    private String major;
    private String school;
    private String college;
    private String description;

    public All() {
    }

    public All(Integer id, String name, String username, String password, String descripe, String phone, Integer state, Integer companyTea, String type, String gender, Integer age, String grade, String major, String school, String college, String description) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.descripe = descripe;
        this.phone = phone;
        this.state = state;
        this.companyTea = companyTea;
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.major = major;
        this.school = school;
        this.college = college;
        this.description = description;
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

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 获取
     * @return school
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置
     * @param school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取
     * @return college
     */
    public String getCollege() {
        return college;
    }

    /**
     * 设置
     * @param college
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "All{id = " + id + ", name = " + name + ", username = " + username + ", password = " + password + ", descripe = " + descripe + ", phone = " + phone + ", state = " + state + ", companyTea = " + companyTea + ", type = " + type + ", gender = " + gender + ", age = " + age + ", grade = " + grade + ", major = " + major + ", school = " + school + ", college = " + college + ", description = " + description + "}";
    }
}
