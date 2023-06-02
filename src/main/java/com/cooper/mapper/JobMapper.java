package com.cooper.mapper;

import com.cooper.entity.Job;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobMapper {
    List<Job> selectAll();
    void add(Job job);
    void update(Job job);
    void delete(Integer id);

}
