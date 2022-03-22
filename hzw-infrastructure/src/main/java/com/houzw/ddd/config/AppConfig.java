package com.houzw.ddd.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.houzw.ddd.gateway.database.config.BaseDOMetaObjectHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author houzw
 * @Date 2022/3/11
 **/
@Configuration
public class AppConfig {

    // MybatisPlus start
    @Bean
    // MybatisPlus乐观锁插件
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        ArrayList<InnerInterceptor> innerInterceptors = new ArrayList<>();
        innerInterceptors.add(new OptimisticLockerInnerInterceptor());
        mybatisPlusInterceptor.setInterceptors(innerInterceptors);
        return mybatisPlusInterceptor;
    }

    @Bean
    // MybatisPlus 自动填充处理类
    public BaseDOMetaObjectHandler baseDOMetaObjectHandler(){
        return new BaseDOMetaObjectHandler();
    }
    // MybatisPlus end
}
