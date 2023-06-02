package com.cooper.entity;

public class Student {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String gender;
    private Integer age;

    private String type;

    private String grade;
    private String major;
    private String phone;

    //学生去就业? 考研? 状态
    private Integer gostate;

    //学生关联老师
    private Integer studentTea;
    private String descripe;

    //学生是否被企业录取状态
    private Integer statue;


    public Student() {
    }

    public Student(Integer id, String username, String password, String name, String gender, Integer age, String type, String grade, String major, String phone, Integer gostate, Integer studentTea, String descripe, Integer statue) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.type = type;
        this.grade = grade;
        this.major = major;
        this.phone = phone;
        this.gostate = gostate;
        this.studentTea = studentTea;
        this.descripe = descripe;
        this.statue = statue;
    }

    public Student(All all) {
        this.username = all.getUsername();
        this.password = all.getPassword();
        this.name = all.getName();
        this.gender = all.getGender();
        this.age = all.getAge();
        this.grade = all.getGrade();
        this.major = all.getMajor();
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
     * @return gostate
     */
    public Integer getGostate() {
        return gostate;
    }

    /**
     * 设置
     * @param gostate
     */
    public void setGostate(Integer gostate) {
        this.gostate = gostate;
    }

    /**
     * 获取
     * @return studentTea
     */
    public Integer getStudentTea() {
        return studentTea;
    }

    /**
     * 设置
     * @param studentTea
     */
    public void setStudentTea(Integer studentTea) {
        this.studentTea = studentTea;
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
     * @return statue
     */
    public Integer getStatue() {
        return statue;
    }

    /**
     * 设置
     * @param statue
     */
    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public String toString() {
        return "Student{id = " + id + ", username = " + username + ", password = " + password + ", name = " + name + ", gender = " + gender + ", age = " + age + ", type = " + type + ", grade = " + grade + ", major = " + major + ", phone = " + phone + ", gostate = " + gostate + ", studentTea = " + studentTea + ", descripe = " + descripe + ", statue = " + statue + "}";
    }
}
