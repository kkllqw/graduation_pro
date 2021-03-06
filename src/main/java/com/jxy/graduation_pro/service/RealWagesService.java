package com.jxy.graduation_pro.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxy.graduation_pro.entity.BasicWages;
import com.jxy.graduation_pro.entity.GainAccount;
import com.jxy.graduation_pro.entity.GateCard;
import com.jxy.graduation_pro.entity.RealWages;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jxy.graduation_pro.utils.result.Result;


public interface RealWagesService extends IService<RealWages> {
    Result searchRealWagesByUserId(IPage<RealWages> page, Integer userId);
    Result searchRealWagesByRealTime(RealWages realWages);
    Result updateBasicWages(RealWages realWages);
    Result searchRealWagesById(Integer id);

    //提供给考勤系统
    Boolean addRealWagesByGainAccount(GateCard gateCard);

}
