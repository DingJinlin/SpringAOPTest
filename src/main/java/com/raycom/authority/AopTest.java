package com.raycom.authority;

import com.raycom.authority.service.IHelloWorldService;
import com.raycom.authority.service.IIntroductionService;
import com.raycom.authority.service.impl.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dingjinlin on 16-5-27.
 */
public class AopTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-config.xml");
        IHelloWorldService helloWorldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
//        helloWorldService.sayHello();
        helloWorldService.sayBefore("before");
        helloWorldService.sayBefore1("before1");
//        helloWorldService.sayAfterReturning();
//        helloWorldService.sayAfterThrowing();
//        helloWorldService.sayAfterFinally();

//        Object result = helloWorldService.sayAround("haha");
//        System.out.println("========== around after advice result: " + result);
//        System.out.println("======================================");

//        IIntroductionService introductionHelloWorldService = ctx.getBean("helloWorldService", IIntroductionService.class);
//        introductionHelloWorldService.induct();
//        introductionHelloWorldService.before("ppppp");
//        System.out.println("======================================");

//        IIntroductionService introductionService = ctx.getBean("introductionService", IIntroductionService.class);
//        introductionService.induct();
//        introductionService.before("ppppp");
//        System.out.println("======================================");
    }
}
