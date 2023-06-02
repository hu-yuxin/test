package com.cooper.service.impl;

import com.cooper.entity.GraduateStu;
import com.cooper.mapper.GraduateStuMapper;
import com.cooper.service.GraduateStuService;
import com.cooper.utils.PageBean;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional
public class GraduateStuServiceImpl implements GraduateStuService {

    @Autowired
    private GraduateStuMapper graduateStuMapper;

    @Override
    public GraduateStu selectOne(Integer id) {
        return graduateStuMapper.selectOne(id);
    }

    @Override
    public List<GraduateStu> selectAll() {
        List<GraduateStu> graduateStus = graduateStuMapper.selectAll();
        return graduateStus;
    }

    @Override
    public List<GraduateStu> selectByConditions(GraduateStu graduateStu) {
        List<GraduateStu> graduateStus = graduateStuMapper.selectByManyConditions(graduateStu);
        return graduateStus;
    }

    @Override
    public PageBean<GraduateStu> selectPage(Integer currentPage, Integer pageSize) {
        Integer curPage = (currentPage - 1) * pageSize;
        List<GraduateStu> graduateStus = graduateStuMapper.selectPage(curPage, pageSize);
        Integer total = graduateStuMapper.selectTotal();
        return new PageBean<>(graduateStus,total);
    }

    @Override
    public Boolean insertOne(GraduateStu graduateStu) {
        return graduateStuMapper.insertGraduate(graduateStu) > 0;
    }

    @Override
    public Boolean updateOne(GraduateStu graduateStu) {
        return graduateStuMapper.updateGraduate(graduateStu) > 0;
    }

    @Override
    public Boolean deleteOne(Integer id) {
        return graduateStuMapper.deleteGraduate(id) > 0;
    }

    @Override
    public Boolean deleteMore(Integer[] ids) {
        return graduateStuMapper.deleteMoreGraduate(ids) > 0;
    }


}
