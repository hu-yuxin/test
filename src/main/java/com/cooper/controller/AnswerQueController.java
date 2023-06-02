package com.cooper.controller;

import com.cooper.controller.utils.Result;
import com.cooper.entity.AnswerQue;
import com.cooper.service.AnswerQueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answerQues")
@CrossOrigin
public class AnswerQueController {

    @Autowired
    private AnswerQueService answerQueService;

    @GetMapping
    public Result getAllInfo(){
        List<AnswerQue> answerList = answerQueService.getAll();
        if(answerList != null){
            return new Result(true,answerList);
        } else if(answerList == null){
            return new Result(true,"请求成功,但无数据返回");
        } else {
            return new Result(false,"请求失败");
        }
    }
    
    @GetMapping("/byCons")
    public Result getByCon(@RequestBody AnswerQue answerQue){
        List<AnswerQue> answerQues = answerQueService.selectMoreConditions(answerQue);
        if(answerQues != null){
            return new Result(true,answerQues);
        } else if(answerQues == null){
            return new Result(true,"请求成功,但无数据返回");
        } else {
            return new Result(false,"请求失败");
        }
    }
    
    @GetMapping("/{id}")
    public Result getOne(@PathVariable Integer id){
        AnswerQue answerQue = answerQueService.selectOne(id);
        return new Result(answerQue != null ? true : false, answerQue);
    }

    @PostMapping
    public Result insertOne(@RequestBody AnswerQue answerQue){
        Boolean flag = answerQueService.insertOne(answerQue);
        return new Result(flag, answerQue.getId(), flag ? "添加成功^_^" : "添加失败-_-!");
    }

    @DeleteMapping("/{id}")
    public Result deleteOne(@PathVariable Integer id){
        Boolean flag = answerQueService.deleteOne(id);
        return new Result(flag,flag ? "删除成功^_^" : "删除失败-_-!");
    }

    @DeleteMapping
    public Result deleteMore(@RequestBody Integer[] ids){
        Boolean flag = answerQueService.deleteMore(ids);
        return new Result(flag,flag ? "删除成功^_^" : "删除失败-_-!");
    }

    @PutMapping
    public Result updateOne(@RequestBody AnswerQue answerQue){
        Boolean flag = answerQueService.updateOne(answerQue);
        return new Result(flag,flag ? "修改成功^_^" : "修改失败-_-!");
    }

}
