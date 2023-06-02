package com.cooper.controller;


import com.cooper.controller.utils.Result;
import com.cooper.entity.Company;
import com.cooper.mapper.TeacherMapper;
import com.cooper.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class TeacherController {
    @Autowired
    private TeacherService teacherService;


    @GetMapping("/selectCompany")
    public Result selectCom() {
        List<Company> companies = teacherService.selectCompany();
        if (companies != null) {
            return new Result(true, companies);
        } else if(companies == null){
            return new Result(true, "查询成功,无数据返回");
        }else {
            return new Result(false,"请求失败");
        }
    }

    @PutMapping("/insertCompany")
    public Result insertCom(@RequestBody Company company) {
        Boolean flag = teacherService.insertCompany(company);
        if (flag) {
            return new Result(flag, "添加成功");
        } else {
            return new Result(flag, "添加失败");
        }
    }
}
