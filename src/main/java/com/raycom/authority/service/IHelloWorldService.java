package com.raycom.authority.service;

/**
 * Created by dingjinlin on 16-5-27.
 */
public interface IHelloWorldService {
    void sayHello();
    void sayBefore(String param);
    void sayBefore1(String param1);
    boolean sayAfterReturning();
    void sayAfterThrowing();
    void sayAfterFinally();
    String sayAround(String param);
}
