package com.cooper.service;

import com.cooper.entity.Company;
import com.cooper.entity.Student;
import com.cooper.entity.Teacher;


public interface LoginService {
    //学生
    Boolean selectLogin( String username, String password);

    //辅导员登录
    Boolean selectLoginTea(String teaUsername, String password);

    //企业登录
    Boolean selectLogincom( String username, String password);

    //注册
    Boolean selectByUsername(String username);

    Boolean selectRegister(Student student);

    Boolean selectByUsernameTea(String username);

    Boolean selectRegisterTea(Teacher teacher);

    Boolean selectByUsernameCom(String username);

    Boolean selectRegisterCom(Company company);
}
