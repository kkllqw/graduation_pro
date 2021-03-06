package com.jxy.graduation_pro.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

//配置类
@Configuration
//指定mapper接口位置
@MapperScan(basePackages = " com.jxy.graduation_pro.mapper")
@EnableTransactionManagement(proxyTargetClass = true)
public class MyBaitsPlusConfig {
    //分页助手
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor() ;
    }


}
