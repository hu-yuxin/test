package com.cooper.controller;

import com.cooper.entity.Job;
import com.cooper.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
@CrossOrigin
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getAll(){
        return jobService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody Job job){
        jobService.add(job);
    }

    @PutMapping("/update")
    public void update(@RequestBody Job job){
        jobService.update(job);
    }

    @PutMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        jobService.delete(id);
    }
}
