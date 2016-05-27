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
}
