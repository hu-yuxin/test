package com.cooper.controller;

import com.cooper.entity.GraduateStu;
import com.cooper.service.GraduateStuService;
import com.cooper.controller.utils.Result;
import com.cooper.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/graduates")
@CrossOrigin
public class GraduateStuController {

    @Autowired
    private GraduateStuService graduateStuService;

    //查一个
    @GetMapping("/{id}")
    public Result selectOne(@PathVariable Integer id){
        GraduateStu graduateStu = graduateStuService.selectOne(id);
        Boolean flag = false;
        if (graduateStu != null){
            flag = true;
        }
        return new Result(flag,graduateStu);
    }

    //查所有
    @GetMapping
    public Result getAll(){
        List<GraduateStu> graduateStus = graduateStuService.selectAll();
        if(graduateStus != null){
            return new Result(true,graduateStus);
        } else if(graduateStus == null){
            return new Result(true,"请求成功,但无数据返回");
        } else {
            return new Result(false,"请求失败");
        }

    }

    //多条件查询
    @GetMapping("/byConditions")
    public Result getSome(@RequestBody GraduateStu graduateStu){
        List<GraduateStu> graduateStus = graduateStuService.selectByConditions(graduateStu);
        if(graduateStus != null){
            return new Result(true,graduateStus);
        } else if(graduateStus == null){
            return new Result(true,"请求成功,但无数据返回");
        } else {
            return new Result(false,"请求失败");
        }
    }

    //分页查询
    @GetMapping("/{currentPage}/{pageSize}")
    public Result getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize){
        PageBean<GraduateStu> graduateStuPageBean = graduateStuService.selectPage(currentPage, pageSize);
        if(graduateStuPageBean != null){
            return new Result(true,graduateStuPageBean);
        } else if(graduateStuPageBean == null){
            return new Result(true,"请求成功,但无数据返回");
        } else {
            return new Result(false,"请求失败");
        }
    }

    //添加
    @PostMapping
    public Result insertOne(@RequestBody GraduateStu graduateStu){
        Boolean flag = graduateStuService.insertOne(graduateStu);
        return new Result(flag, graduateStu.getId(), flag ? "添加成功^_^" : "添加失败-_-!");
    }

    //修改
    @PutMapping
    public Result updateOne(@RequestBody GraduateStu graduateStu){
        Boolean flag = graduateStuService.updateOne(graduateStu);
        return new Result(flag,flag ? "修改成功^_^" : "修改失败-_-!");
    }

    //删除单条
    @DeleteMapping("/{id}")
    public Result deleteOne(@PathVariable Integer id){
        Boolean flag = graduateStuService.deleteOne(id);
        return new Result(flag,flag ? "删除成功^_^" : "删除失败-_-!");
    }

    //删除多条(前端直接传数组)
    @DeleteMapping
    public Result deleteMore(@RequestBody Integer[] ids){
        Boolean flag = graduateStuService.deleteMore(ids);
        return new Result(flag,flag ? "删除成功^_^" : "删除失败-_-!");
    }
}
