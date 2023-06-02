package com.cooper.mapper;

import com.cooper.entity.Company;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {

    List<Company> selectCompany();

    Integer insertCompany(Company company);
}