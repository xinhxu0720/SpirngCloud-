package com.xuxinhui.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

public class    MySelfRule {
    @Bean
    public IRule myRule()
    {
        return new RandomRule_xxh();//Ribbon默认是轮询，我自定义为随机
    }
}
