package com.cooper.controller;

import com.cooper.controller.utils.Result;
import com.cooper.entity.ResumeDelivery;
import com.cooper.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resume")
@CrossOrigin
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @GetMapping("/{id}")
    public Result getResumeById(@PathVariable("id") Integer id) {
        ResumeDelivery resumeDelivery = resumeService.getResumeById(id);
        Boolean flag = false;
        if (resumeDelivery != null){
            flag = true;
        }
        return new Result(flag,resumeDelivery);
    }

    @GetMapping
    public Result getAllResumes() {
        List<ResumeDelivery> resumeDelivery = resumeService.getAllResumes();
        if(resumeDelivery != null){
            return new Result(true,resumeDelivery);
        } else if(resumeDelivery == null){
            return new Result(true,"请求成功,但无数据返回");
        } else {
            return new Result(false,"请求失败");
        }
    }
    @PostMapping("/{id}/approve")
    public Result approveResume(@PathVariable("id") Integer id) {
        resumeService.approveResume(id);
        return new Result(true);
    }

    @PostMapping("/{id}/reject")
    public Result rejectResume(@PathVariable("id") Integer id) {
        resumeService.rejectResume(id);
        return new Result(true);
    }
}
