package com.jxy.graduation_pro.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.jxy.graduation_pro.entity.BasicWages;
import com.jxy.graduation_pro.mapper.BasicWagesMapper;
import com.jxy.graduation_pro.service.BasicWagesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxy.graduation_pro.utils.result.Result;
import com.jxy.graduation_pro.utils.result.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;


@Service
public class BasicWagesServiceImpl extends ServiceImpl<BasicWagesMapper, BasicWages> implements BasicWagesService {

    @Autowired
    private  BasicWagesMapper basicWagesMapper;

    private static final int  activeStatus = 1;

    @Override
    public Result insertBasicWages(BasicWages basicWages) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_name",basicWages.getUserName());
        if (basicWagesMapper.selectCount(wrapper) > 0 ){
            return  Result.failure(ResultCode.DATA_ALREADY_EXISTED);
        }
        basicWages.setBasicStatus(activeStatus);
        basicWagesMapper.insert(basicWages);
        return Result.success();
    }

    @Override
    public Result deleteBasicWages(BasicWages basicWages) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_name",basicWages.getUserName());
        if (basicWagesMapper.delete(wrapper) > 0){
            return Result.success();  //删除成功
        }else {
            return Result.failure(ResultCode.FAIL);
        }
    }

    @Override
    public Result updateBasicWages(BasicWages basicWages) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_name",basicWages.getUserName());
        basicWagesMapper.update(basicWages,wrapper);
        return Result.success();
    }

    @Override
    public Result getBasicWagesTables(IPage<BasicWages> page, BasicWages basicWages) {
        QueryWrapper wrapper = new QueryWrapper();
        if (basicWages != null) {
            if (basicWages.getDeptId() != null) { //部门
                wrapper.eq("dept_id", basicWages.getDeptId());
            }

            if (basicWages.getUserName() != null &&  basicWages.getUserName() !=""  ) { //姓名
                wrapper.like("user_name", basicWages.getUserName());
            }
        }
        wrapper.eq("basic_status", activeStatus);
        page = basicWagesMapper.selectPage(page,wrapper);
        return Result.success(page);
    }

    @Override
    public Result searchBasicWagesByUserId(Integer userId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_id",userId);
        return Result.success(basicWagesMapper.selectOne(wrapper));
    }

    //真实工资需要的后端查询
    @Override
    public BasicWages searchBasicWageByUserId(Integer userId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_id",userId);
        return basicWagesMapper.selectOne(wrapper);
    }


}
