package com.raycom.authority.aop;

/**
 * Created by dingjinlin on 16-5-27.
 */
public class HelloWorldAspect {
    public void beforeAdvice(String param) {
        System.out.println("========== before advice param: " + param);
    }
    public void beforeAdvice() {
        System.out.println("========== before advice");
    }

    public void afterFinallyAdvice() {
        System.out.println("========== after finally advice");
    }
}
