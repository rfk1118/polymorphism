package com.renfakai.polymorphism.template.two.service.impl;

import com.renfakai.polymorphism.dto.HelloRequest;
import com.renfakai.polymorphism.template.two.service.ThreePolicyService;
import com.renfakai.polymorphism.template.two.service.manager.TwoPolicyManager;
import org.springframework.stereotype.Service;

@Service
public class HelloTwoPolicyServiceImpl implements ThreePolicyService {

    @Override
    public String print(HelloRequest helloRequest) {
        return helloRequest.getName() + "hello";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        TwoPolicyManager.register("hello", this);
    }
}
