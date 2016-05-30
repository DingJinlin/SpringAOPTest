package com.raycom.authority.service.impl;

import com.raycom.authority.service.IHelloWorldService;

/**
 * Created by dingjinlin on 16-5-27.
 */
public class HelloWorldService implements IHelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("================== Hello World!");
    }

    @Override
    public void sayBefore(String param) {
        System.out.println("================== before say: " + param);
    }

    @Override
    public void sayBefore1(String param1) {
        System.out.println("================== before1 say: " + param1);
    }

    @Override
    public boolean sayAfterReturning() {
        System.out.println("================== after returning");
        return true;
    }

    @Override
    public void sayAfterThrowing() {
        System.out.println("================== before throwing");
        throw new RuntimeException();
    }

    @Override
    public void sayAfterFinally() {
        System.out.println("================== before finally");
        throw new RuntimeException();
    }

    @Override
    public String sayAround(String param) {
        System.out.println("================== around param: " + param);
        return param;
    }
}
