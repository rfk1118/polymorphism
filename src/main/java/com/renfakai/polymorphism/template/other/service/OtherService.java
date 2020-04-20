package com.renfakai.polymorphism.template.other.service;


import com.renfakai.polymorphism.dto.HelloRequest;

/**
 * @author renfakai
 * 使用spring方式编写多态
 */
public interface OtherService {


    /**
     * @param helloRequest 请求
     */
    String print(HelloRequest helloRequest);
}
