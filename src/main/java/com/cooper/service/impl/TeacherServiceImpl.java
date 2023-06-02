package com.cooper.service.impl;

import com.cooper.entity.Company;
import com.cooper.mapper.TeacherMapper;
import com.cooper.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Company> selectCompany() {
        List<Company> companies = teacherMapper.selectCompany();
        return companies;
    }

    @Override
    public Boolean insertCompany(Company company) {
        return teacherMapper.insertCompany(company) > 0;
    }
}
