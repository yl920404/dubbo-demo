package com.dwj.dubbo.provider.service.impl;

import com.dwj.dubbo.provider.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @ClassName DemoServiceImpl
 * @Description
 * @Author dwjian
 * @Date 2019/8/11 23:41
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return name + " Hello!";
    }
}
