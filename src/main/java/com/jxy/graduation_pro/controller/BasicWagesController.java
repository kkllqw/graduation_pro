package com.jxy.graduation_pro.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxy.graduation_pro.entity.BasicWages;
import com.jxy.graduation_pro.service.BasicWagesService;
import com.jxy.graduation_pro.utils.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/")
public class BasicWagesController {
    @Autowired
    private BasicWagesService basicWagesService;

    @RequestMapping("addBasicWages")
    public Result addBasicWages(BasicWages basicWages){
        return basicWagesService.insertBasicWages(basicWages);
    }

    @GetMapping("BasicWages")
    public Result<IPage> BasicWagesList(BasicWages basicWages, Integer pageNo,Integer pageSize){
        System.err.println(basicWages.getUserName());
        System.err.println(basicWages.getDeptId());
        return basicWagesService.getBasicWagesTables(new Page<>(pageNo,pageSize), basicWages);
    }

//    @GetMapping("/BasicWages/{pageNo}/{pageSize}")
//    public Result<IPage> BasicWagesList(BasicWages basicWages, @PathVariable("pageNo") Integer pageNo
//            , @PathVariable("pageSize") Integer pageSize, HttpSession session){
//        return basicWagesService.getBasicWagesTables(new Page<>(pageNo,pageSize), basicWages);
//    }
    //增删改查
    @PostMapping("BasicWagesInsert")
    public Result BasicWagesInsert(BasicWages basicWages){
        return basicWagesService.insertBasicWages(basicWages);
    }
    @PostMapping("BasicWagesDel")
    public Result BasicWagesDel(BasicWages basicWages){
        return basicWagesService.deleteBasicWages(basicWages);
    }
    @PostMapping("BasicWagesUpdate")
    public Result BasicWagesUpdate(BasicWages basicWages){
        return basicWagesService.updateBasicWages(basicWages);
    }


    @GetMapping("BasicWagesSearchByUserId")
    public Result BasicWagesSearchById(Integer userId){
        return basicWagesService.searchBasicWagesByUserId(userId);
    }




}
