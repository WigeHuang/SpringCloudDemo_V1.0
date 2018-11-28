package com.ribbon.serviceribbon.controller;

import com.ribbon.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ManggoJH
 * @Date: 2018/11/27 13:59
 * @Description: *
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;
    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return helloService.hiService(name);
    }
}
