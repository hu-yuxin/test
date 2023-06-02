package com.cooper.controller;

import com.cooper.controller.utils.Result;
import com.cooper.entity.ZouMaDeng;
import com.cooper.service.ZouMaDengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pics")
@CrossOrigin
public class ZouMaDengController {

    @Autowired
    private ZouMaDengService zouMaDengService;

    @GetMapping
    public Result getPic(){
        List<ZouMaDeng> allPic = zouMaDengService.getAll();
        if(allPic != null){
            return new Result(true,allPic);
        } else if(allPic == null){
            return new Result(true,"请求成功,但无数据返回");
        } else {
            return new Result(false,"请求失败");
        }
    }

}
