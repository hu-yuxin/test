package com.cooper.service;

import com.cooper.entity.Company;

import java.util.List;

public interface TeacherService {

    List<Company> selectCompany();

    Boolean insertCompany(Company company);

}
