package com.cooper.mapper;

import com.cooper.entity.AnswerQue;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnswerQueMapper {

    //查询所有
    List<AnswerQue> selectAll();

    //多条件查询(老师、科目、类型)
    List<AnswerQue> selectByManyConditions(AnswerQue answerQue);

    //查询
    AnswerQue selectAnswerQueMapper(Integer id);

    //添加
    Integer insertOneAnswerQueMapper(AnswerQue answerQue);

    //删除
    Integer deleteOne(Integer id);

    Integer deleteMore(Integer[] ids);

    //修改
    Integer updateOne(AnswerQue answerQue);
}
