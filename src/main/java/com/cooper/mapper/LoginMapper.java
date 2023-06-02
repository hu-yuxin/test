package com.cooper.mapper;

import com.cooper.entity.Company;
import com.cooper.entity.Student;
import com.cooper.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {
    //学生注册 登录
    Student selectLogin(@Param("username") String username, @Param("password") String password);

    //辅导员登录
    Teacher selectLoginTea(@Param("username") String username, @Param("password") String password);

    //企业登录

    Company selectLogincom(@Param("username") String username, @Param("password") String password);

    //注册

    Student selectByUsername(String username);

    Integer selectRegister(Student student);

    Teacher selectByUsernameTea(String username);

    Integer selectRegisterTea(Teacher teacher);

    Company selectByUsernameCom(String username);

    Integer selectRegisterCom(Company company);
}
