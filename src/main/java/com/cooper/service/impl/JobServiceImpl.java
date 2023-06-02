package com.cooper.service.impl;

import com.cooper.entity.Job;
import com.cooper.mapper.JobMapper;
import com.cooper.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public List<Job> getAll() {
        return jobMapper.selectAll();
    }

    @Override
    public void add(Job job) {
        jobMapper.add(job);
    }

    @Override
    public void update(Job job) {
         jobMapper.update(job);
    }

    @Override
    public void delete(Integer id) {
          jobMapper.delete(id);
    }
}
