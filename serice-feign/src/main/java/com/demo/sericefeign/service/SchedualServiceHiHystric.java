package com.demo.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Author: ManggoJH
 * @Date: 2018/11/27 15:19
 * @Description: *
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHello {
    @Override
    public String sayHelloForClientOne(String name){
        return "错误页面："+name;
    }
}
