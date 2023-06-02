package com.cooper.entity;

public class AnswerQue {
    private Integer id;
    private String teaName;
    private String subject;
    private String dateTime;
    private String classRoom;
    private String type;


    public AnswerQue() {
    }

    public AnswerQue(Integer id, String teaName, String subject, String dateTime, String classRoom, String type) {
        this.id = id;
        this.teaName = teaName;
        this.subject = subject;
        this.dateTime = dateTime;
        this.classRoom = classRoom;
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
     * @return teacherName
     */
    public String getTeacherName() {
        return teaName;
    }

    /**
     * 设置
     * @param teacherName
     */
    public void setTeacherName(String teacherName) {
        this.teaName = teacherName;
    }

    /**
     * 获取
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 获取
     * @return dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * 设置
     * @param dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * 获取
     * @return classRoom
     */
    public String getClassRoom() {
        return classRoom;
    }

    /**
     * 设置
     * @param classRoom
     */
    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
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
        return "AnswerQue{id = " + id + ", teacherName = " + teaName + ", subject = " + subject + ", dateTime = " + dateTime + ", classRoom = " + classRoom + ", type = " + type + "}";
    }
}
