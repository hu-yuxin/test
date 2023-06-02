package com.cooper.controller;

import com.cooper.controller.utils.Result;
import com.cooper.entity.All;
import com.cooper.entity.Company;
import com.cooper.entity.Student;
import com.cooper.entity.Teacher;
import com.cooper.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/user")
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public Result selectLogin(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password, @RequestParam(value = "type") String type) {
        switch (type) {
            case "student":
                Boolean flag = loginService.selectLogin(username, password);
                return new Result(flag, flag ? "登录成功^_^" : "登录失败-_-!");
            case "teacher":
                Boolean flag2 = loginService.selectLoginTea(username, password);
                return new Result(flag2, flag2 ? "登录成功^_^" : "登录失败-_-!");
            case "company":
                Boolean flag3 = loginService.selectLogincom(username, password);
                return new Result(flag3, flag3 ? "登录成功^_^" : "登录失败-_-!");
        }
        return new Result(false, "请选择类型进行登录");
    }


    @PostMapping("/register")
    public Result selectRegister(@RequestBody All all) {
        Student student = new Student(all);
        Teacher teacher = new Teacher(all);
        Company company = new Company(all);
        switch (all.getType()) {
            case "student":
                Boolean flag = loginService.selectByUsername(all.getUsername());
                if (flag) {
                    return new Result(false, "此账号已经注册");
                } else {
                    Boolean flag1 = loginService.selectRegister(student);
                    return new Result(flag1, flag1 ? "注册成功^_^" : "注册失败-_-!");
                }
            case "teacher":
                Boolean flag2 = loginService.selectByUsernameTea(all.getUsername());
                if (flag2) {
                    return new Result(false, "此账号已经注册");
                } else {
                    Boolean flag3 = loginService.selectRegisterTea(teacher);
                    return new Result(flag3, flag3 ? "注册成功^_^" : "注册失败-_-!");
                }
            case "company":
                Boolean flag3 = loginService.selectByUsernameCom(all.getUsername());
                if (flag3) {
                    return new Result(false, "此账号已经注册");
                } else {
                    Boolean flag4 = loginService.selectRegisterCom(company);
                    return new Result(flag4, flag4 ? "注册成功^_^" : "注册失败-_-!");
                }
        }
        return new Result(false, "请选择类型进行登录");
    }
}
