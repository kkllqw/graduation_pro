package com.jxy.graduation_pro.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxy.graduation_pro.entity.BasicWages;
import com.jxy.graduation_pro.entity.RealWages;
import com.jxy.graduation_pro.service.RealWagesService;
import com.jxy.graduation_pro.utils.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class RealWagesController {

    @Autowired
    private RealWagesService realWagesService;

    //用户那边需要通过员工编号和分页来进行查询员工工资条   然后通过id由大到小排列
    @GetMapping("RealWages")
    public Result<IPage> RealWagesList(Integer userId , Integer pageNo,Integer pageSize){

        return realWagesService.searchRealWagesByUserId(new Page<>(pageNo,pageSize), userId);
    }

    @GetMapping("AllRealWages")
    public Result RealWagesList(RealWages realWages){

        return realWagesService.searchRealWagesByRealTime(realWages);
    }

    @PostMapping("RealWagesUpdate")
    public Result RealWagesUpdate(RealWages realWages){
        return realWagesService.updateBasicWages(realWages);
    }

    @GetMapping("RealWagesById")
    public Result RealWagesById(Integer id ){

        return realWagesService.searchRealWagesById(id);
    }



}
