package com.cooper.entity;

public class Teacher {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String username;
    private String password;
    private String school;
    private String college;
    private String phone;
    private String description;
    private String type;




    public Teacher(All all) {
        this.name = all.getName();
        this.gender = all.getGender();
        this.age = all.getAge();
        this.username = all.getUsername();
        this.password = all.getPassword();
        this.school = all.getSchool();
        this.college = all.getCollege();
        this.phone = all.getPhone();
        this.description = all.getDescription();

    }

    public Teacher() {
    }

    public Teacher(Integer id, String name, String gender, Integer age, String username, String password, String school, String college, String phone, String description, String type) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.username = username;
        this.password = password;
        this.school = school;
        this.college = college;
        this.phone = phone;
        this.description = description;
        this.type = type;
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

    public String toString() {
        return "Teacher{id = " + id + ", name = " + name + ", gender = " + gender + ", age = " + age + ", username = " + username + ", password = " + password + ", school = " + school + ", college = " + college + ", phone = " + phone + ", description = " + description + ", type = " + type + "}";
    }
}
