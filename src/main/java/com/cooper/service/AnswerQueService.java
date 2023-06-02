package com.cooper.service;

import com.cooper.entity.AnswerQue;

import java.util.List;

public interface AnswerQueService {
    List<AnswerQue> getAll();

    List<AnswerQue> selectMoreConditions(AnswerQue answerQue);

    AnswerQue selectOne(Integer id);

    Boolean insertOne(AnswerQue answerQue);

    Boolean deleteOne(Integer id);

    Boolean deleteMore(Integer[] ids);

    Boolean updateOne(AnswerQue answerQue);
}
