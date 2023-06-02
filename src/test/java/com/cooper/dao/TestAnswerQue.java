package com.cooper.dao;

import com.cooper.config.SpringConfig;
import com.cooper.entity.AnswerQue;
import com.cooper.mapper.AnswerQueMapper;
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
public class TestAnswerQue {
    @Autowired
    private AnswerQueMapper answerQueMapper;

    @Test
    public void Test1(){
        List<AnswerQue> answerQues = answerQueMapper.selectAll();
        System.out.println(answerQues);
    }
}
