package com.cooper.service;

import com.cooper.entity.Job;

import java.util.List;

public interface JobService {
    List<Job> getAll();
    void add(Job job);
    void update(Job job);
    void delete(Integer id);

}
