package com.demo.sericefeign.controller;

import com.demo.sericefeign.service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ManggoJH
 * @Date: 2018/11/27 14:52
 * @Description: *
 */
@RestController
public class HelloController {
    @Autowired
    SchedualServiceHello schedualServiceHello;
    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam(value = "name") String name){
        return schedualServiceHello.sayHelloForClientOne(name);
    }
}
