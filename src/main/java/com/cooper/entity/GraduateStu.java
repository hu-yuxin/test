package com.cooper.entity;

public class GraduateStu {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String originalSchool;
    private String originalSchoolCollege;
    private String originalMajor;
    private String graduateSchool;
    private String graduateMajor;
    private String stuGrade;
    private String graduateYear;
    private Integer status;


    public GraduateStu() {
    }

    public GraduateStu(Integer id, String name, String sex, Integer age, String originalSchool, String originalSchoolCollege, String originalMajor, String graduateSchool, String graduateMajor, String stuGrade, String graduateYear, Integer status) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.originalSchool = originalSchool;
        this.originalSchoolCollege = originalSchoolCollege;
        this.originalMajor = originalMajor;
        this.graduateSchool = graduateSchool;
        this.graduateMajor = graduateMajor;
        this.stuGrade = stuGrade;
        this.graduateYear = graduateYear;
        this.status = status;
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
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
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
     * @return originalSchool
     */
    public String getOriginalSchool() {
        return originalSchool;
    }

    /**
     * 设置
     * @param originalSchool
     */
    public void setOriginalSchool(String originalSchool) {
        this.originalSchool = originalSchool;
    }

    /**
     * 获取
     * @return originalSchoolCollege
     */
    public String getOriginalSchoolCollege() {
        return originalSchoolCollege;
    }

    /**
     * 设置
     * @param originalSchoolCollege
     */
    public void setOriginalSchoolCollege(String originalSchoolCollege) {
        this.originalSchoolCollege = originalSchoolCollege;
    }

    /**
     * 获取
     * @return originalMajor
     */
    public String getOriginalMajor() {
        return originalMajor;
    }

    /**
     * 设置
     * @param originalMajor
     */
    public void setOriginalMajor(String originalMajor) {
        this.originalMajor = originalMajor;
    }

    /**
     * 获取
     * @return graduateSchool
     */
    public String getGraduateSchool() {
        return graduateSchool;
    }

    /**
     * 设置
     * @param graduateSchool
     */
    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    /**
     * 获取
     * @return graduateMajor
     */
    public String getGraduateMajor() {
        return graduateMajor;
    }

    /**
     * 设置
     * @param graduateMajor
     */
    public void setGraduateMajor(String graduateMajor) {
        this.graduateMajor = graduateMajor;
    }

    /**
     * 获取
     * @return stuGrade
     */
    public String getStuGrade() {
        return stuGrade;
    }

    /**
     * 设置
     * @param stuGrade
     */
    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }

    /**
     * 获取
     * @return graduateYear
     */
    public String getGraduateYear() {
        return graduateYear;
    }

    /**
     * 设置
     * @param graduateYear
     */
    public void setGraduateYear(String graduateYear) {
        this.graduateYear = graduateYear;
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

    public String toString() {
        return "GraduateStu{id = " + id + ", name = " + name + ", sex = " + sex + ", age = " + age + ", originalSchool = " + originalSchool + ", originalSchoolCollege = " + originalSchoolCollege + ", originalMajor = " + originalMajor + ", graduateSchool = " + graduateSchool + ", graduateMajor = " + graduateMajor + ", stuGrade = " + stuGrade + ", graduateYear = " + graduateYear + ", status = " + status + "}";
    }
}
