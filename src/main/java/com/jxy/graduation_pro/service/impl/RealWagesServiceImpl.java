package com.jxy.graduation_pro.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxy.graduation_pro.entity.BasicWages;
import com.jxy.graduation_pro.entity.GainAccount;
import com.jxy.graduation_pro.entity.GateCard;
import com.jxy.graduation_pro.entity.RealWages;
import com.jxy.graduation_pro.mapper.BasicWagesMapper;
import com.jxy.graduation_pro.mapper.RealWagesMapper;
import com.jxy.graduation_pro.service.BasicWagesService;
import com.jxy.graduation_pro.service.RealWagesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxy.graduation_pro.utils.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;


@Service
public class RealWagesServiceImpl extends ServiceImpl<RealWagesMapper, RealWages> implements RealWagesService {

    @Autowired
    private RealWagesMapper realWagesMapper;
    @Autowired
    private BasicWagesService basicWagesService;


    @Override
    public Result searchRealWagesByUserId(IPage<RealWages> page, Integer userId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_id",userId);
        page = realWagesMapper.selectPage(page,wrapper);
        return Result.success(page);
    }

    @Override
    public Result searchRealWagesByRealTime(RealWages realWages) {
        QueryWrapper wrapper = new QueryWrapper();
        if (realWages != null) {
            if (realWages.getDeptId() != null) { //部门
                wrapper.eq("dept_id", realWages.getDeptId());
            }

            if (realWages.getRealTime() != null &&  realWages.getRealTime() !=""  ) {
                wrapper.eq("real_time", realWages.getRealTime());
            }else{
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                if (month == 0){
                    month = 12;
                    year = year -1 ;
                }
                if (month <= 9){
                    wrapper.eq("real_time", year+"-0"+month);
                }else {
                    wrapper.eq("real_time", year+"-"+month);
                }

            }
        }

        return Result.success(realWagesMapper.selectList(wrapper));
    }

    @Override
    public Result updateBasicWages(RealWages realWages) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id",realWages.getId());

        return Result.success(realWagesMapper.updateById(realWages));
    }

    @Override
    public Result searchRealWagesById(Integer id) {
        return Result.success(realWagesMapper.selectById(id));
    }

    //给考勤的接口
    @Override
    public Boolean addRealWagesByGainAccount(GateCard gateCard) {

        BasicWages basicWages = basicWagesService.searchBasicWageByUserId(gateCard.getUserId());

        return true;
    }


}
