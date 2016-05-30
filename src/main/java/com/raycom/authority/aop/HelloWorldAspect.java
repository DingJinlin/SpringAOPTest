package com.raycom.authority.aop;

import com.raycom.authority.service.IHelloWorldService;
import com.raycom.authority.service.IIntroductionService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.security.Security;


/**
 * Created by dingjinlin on 16-5-27.
 */

@Aspect()
public class HelloWorldAspect {
    public void beforeAdvice() {
        System.out.println("========== before advice");
    }

//    @Before(value = "beforePointcut(param)", argNames = "param")
    public void beforeAdvice(String param) {
        System.out.println("========== before advice param: " + param);
    }

//    @Before(value = "execution(* com.raycom..*.sayBefore(..))")
    public void before(JoinPoint jp){
        System.out.println("JP Info...");
        System.out.println("toString(): " + jp.toString());
        System.out.println("toShortString(): " + jp.toShortString());
        System.out.println("toLongString(): " + jp.toLongString());
        System.out.println("getSourceLocation(): " + jp.getSourceLocation());
        System.out.println("getKind(): " + jp.getKind());
        Object thisObj = jp.getThis();


        for(Object object : jp.getArgs()) {
            System.out.println("class: " + object.getClass());
            System.out.println("Args: " + object.toString());
        }
    }

//    @Before(value = "args(param)", argNames = "param")
    @Before(value = "args(param)")
    public void beforeA(JoinPoint jp, String param) {
        System.out.println("===param:" + param);
    }

//    @Before(value = "args(param) && target(bean) && @annotation(secure)", argNames = "jp,param,bean,secure")
//    public void beforeA(JoinPoint jp, String param, IHelloWorldService bean, Security secure) {
//        System.out.println("===param:" + param);
//    }

    @AfterReturning(value = "afterReturningPointcut()", argNames = "retVal", returning = "retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("========== after returning advice retVal: " + retVal);
    }

    @AfterThrowing(value = "afterThrowingPointcut()", argNames = "e", throwing = "e")
    public void afterThrowingAdvice(Exception e) {
        System.out.println("========== after throwing advice excepton: " + e);
    }

    @After(value = "afterFinallyPointcut()")
    public void afterFinallyAdvice() {
        System.out.println("========== after finally advice");
    }

    @Around(value = "afterAroundPointcut()")
    public Object aroundAdvice(ProceedingJoinPoint pip) throws Throwable {
        System.out.println("========== around before advice param: " + pip.getArgs()[0]);
        Object retVal = pip.proceed(new Object[]{"replace"});
        retVal = retVal + "+haha";
        System.out.println("========== around after advice");
        return retVal;
    }

    @Pointcut(value = "execution(* com.raycom..*.sayBefore(..)) && args(param)", argNames = "param")
    public void beforePointcut(String param){}

    @Pointcut(value = "execution(* com.raycom..*.sayAfterReturning(..))")
    public void afterReturningPointcut(){}

    @Pointcut(value = "execution(* com.raycom..*.sayAfterThrowing(..))")
    public void afterThrowingPointcut(){}

    @Pointcut(value = "execution(* com.raycom..*.sayAfterFinally(..))")
    public void afterFinallyPointcut(){}

    @Pointcut(value = "execution(* com.raycom..*.sayAround(..))")
    public void afterAroundPointcut(){}

    @DeclareParents(value = "* com.raycom..*.IHelloWordService+", defaultImpl = com.raycom.authority.service.impl.IntroductionService.class)
    private IIntroductionService iIntroductionService;


}
