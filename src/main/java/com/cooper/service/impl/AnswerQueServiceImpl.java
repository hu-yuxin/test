package com.cooper.service.impl;

import com.cooper.entity.AnswerQue;
import com.cooper.mapper.AnswerQueMapper;
import com.cooper.service.AnswerQueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional
public class AnswerQueServiceImpl implements AnswerQueService {

    @Autowired
    private AnswerQueMapper answerQueMapper;

    @Override
    public List<AnswerQue> getAll() {
        return answerQueMapper.selectAll();
    }

    @Override
    public List<AnswerQue> selectMoreConditions(AnswerQue answerQue) {
        return answerQueMapper.selectByManyConditions(answerQue);
    }

    @Override
    public AnswerQue selectOne(Integer id) {
        return answerQueMapper.selectAnswerQueMapper(id);
    }

    @Override
    public Boolean insertOne(AnswerQue answerQue) {
        return answerQueMapper.insertOneAnswerQueMapper(answerQue) > 0;
    }

    @Override
    public Boolean deleteOne(Integer id) {
        return answerQueMapper.deleteOne(id) > 0;
    }

    @Override
    public Boolean deleteMore(Integer[] ids) {
        return answerQueMapper.deleteMore(ids) > 0;
    }

    @Override
    public Boolean updateOne(AnswerQue answerQue) {
        return answerQueMapper.updateOne(answerQue) > 0;
    }
}
