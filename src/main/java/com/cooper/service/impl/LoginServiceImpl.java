package com.cooper.service.impl;

import com.cooper.entity.Company;
import com.cooper.entity.Student;
import com.cooper.entity.Teacher;
import com.cooper.mapper.LoginMapper;
import com.cooper.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    //学生登录
    @Override
    public Boolean selectLogin(String username, String password) {
        Student student = loginMapper.selectLogin(username, password);
        if (student != null) {
            return true;
        }
        return false;
    }


    //管理员登录
    @Override
    public Boolean selectLoginTea(String username, String password) {
        Teacher teacher = loginMapper.selectLoginTea(username, password);
        if (teacher != null) {
            return true;
        }
        return false;
    }

    //企业登录
    @Override
    public Boolean selectLogincom(String username, String password) {
        Company company = loginMapper.selectLogincom(username, password);
        if (company != null) {
            return true;
        }
        return false;
    }

    //注册
    @Override
    public Boolean selectByUsername(String username) {
        Student student = loginMapper.selectByUsername(username);
        if (student != null) {
            return true;
        }
        return false;
    }
    @Override
    public Boolean selectRegister(Student student) {
        return loginMapper.selectRegister(student) > 0;
    }

    @Override
    public Boolean selectByUsernameTea(String username) {
        Teacher teacher = loginMapper.selectByUsernameTea(username);
        if (teacher != null) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean selectRegisterTea(Teacher teacher) {
        return loginMapper.selectRegisterTea(teacher) > 0;
    }

    @Override
    public Boolean selectByUsernameCom(String username) {
        Company company = loginMapper.selectByUsernameCom(username);
        if (company != null) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean selectRegisterCom(Company company) {
        return loginMapper.selectRegisterCom(company) > 0;
    }


}
