package com.cooper.dao;

import com.cooper.config.SpringConfig;
import com.cooper.entity.GraduateStu;
import com.cooper.mapper.GraduateStuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@WebAppConfiguration("src/main/resource")
public class TestGraduateStu {
    @Autowired
    private GraduateStuMapper graduateStuMapper;

    @Test
    public void test1(){
        List<GraduateStu> graduateStus = graduateStuMapper.selectAll();
        System.out.println(graduateStus);
    }

    @Test
    public void test2(){
        GraduateStu graduateStu = new GraduateStu();
        graduateStu.setSex("男");
        List<GraduateStu> graduateStus = graduateStuMapper.selectByManyConditions(graduateStu);
        System.out.println(graduateStus);
    }

}
