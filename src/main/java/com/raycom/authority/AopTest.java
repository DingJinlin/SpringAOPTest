package com.raycom.authority;

import com.raycom.authority.service.IHelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dingjinlin on 16-5-27.
 */
public class AopTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-config.xml");
        IHelloWorldService helloWorldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloWorldService.sayHello();
    }
}
