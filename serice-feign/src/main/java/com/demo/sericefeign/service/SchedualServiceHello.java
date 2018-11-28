package com.demo.sericefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ManggoJH
 * @Date: 2018/11/27 14:48
 * @Description: *
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHello {
    /**
     * RequestMapping 找的是service-hi里面的链接
     * @param name
     * @return
     */
    @RequestMapping(value = "test",method = RequestMethod.GET)
    String sayHelloForClientOne(@RequestParam(value = "name") String name);
}
