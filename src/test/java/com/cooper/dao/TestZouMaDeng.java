package com.cooper.dao;

import com.cooper.config.SpringConfig;
import com.cooper.entity.ZouMaDeng;
import com.cooper.mapper.ZouMaDengMapper;
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
public class TestZouMaDeng {
    @Autowired
    private ZouMaDengMapper zouMaDengMapper;

    @Test
    public void Test(){
        List<ZouMaDeng> zouMaDengs = zouMaDengMapper.selectAll();
        System.out.println(zouMaDengs);
    }
}
