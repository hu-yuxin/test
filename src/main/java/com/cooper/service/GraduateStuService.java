package com.cooper.service;

import com.cooper.entity.GraduateStu;
import com.cooper.utils.PageBean;

import java.util.List;

public interface GraduateStuService {
    GraduateStu selectOne(Integer id);

    List<GraduateStu> selectAll();

    List<GraduateStu> selectByConditions(GraduateStu graduateStu);

    PageBean<GraduateStu> selectPage(Integer currentPage,Integer pageSize);

    Boolean insertOne(GraduateStu graduateStu);

    Boolean updateOne(GraduateStu graduateStu);

    Boolean deleteOne(Integer id);

    Boolean deleteMore(Integer[] ids);
}
