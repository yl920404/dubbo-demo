package com.dwj.dubbo.consumer.controller;

import com.dwj.dubbo.provider.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description
 * @Author dwjian
 * @Date 2019/8/11 23:58
 */
@RestController
@RequestMapping
public class DemoController {

    @Autowired
    private DemoService demoService;

    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name){
        return demoService.sayHello(name);
    }
}
