package com.jxy.graduation_pro.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxy.graduation_pro.entity.BasicWages;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jxy.graduation_pro.utils.result.Result;


public interface BasicWagesService extends IService<BasicWages> {

/*
 *  基本增删改查
 *
 */

    Result insertBasicWages(BasicWages basicWages);
    Result deleteBasicWages(BasicWages basicWages);
    Result updateBasicWages(BasicWages basicWages);

//    分页查询

    //综合查询（查询全部 查询指定 ）
    Result getBasicWagesTables(IPage<BasicWages> page, BasicWages basicWages);

    //id 查询
    Result searchBasicWagesByUserId(Integer userId);

    BasicWages searchBasicWageByUserId(Integer userId);

}
