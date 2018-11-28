package com.ribbon.serviceribbon.service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: ManggoJH
 * @Date: 2018/11/27 13:54
 * @Description: *
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    /**
    * @Author: ManggoJH
    * @param:
    * @return
    * @Date: 2018/11/27 13:56
    * @Description: TODO()
    */
    @HystrixCommand(fallbackMethod = "helloError")
    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/test?name="+name,String.class);
    }
    public String helloError(String name){
        return "错误页面,"+name+" ,sorry,error!";
    }
}
