package com.dwj.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "/dubbo/dubbo-provider.xml")
public class DubboProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(DubboProviderApplication.class, args);

        synchronized (DubboProviderApplication.class) {
            while (true) {
                try {
                    DubboProviderApplication.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
