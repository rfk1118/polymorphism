package com.renfakai.polymorphism.template.four.service.impl;

import com.renfakai.polymorphism.dto.HelloRequest;
import com.renfakai.polymorphism.template.four.service.FourPolicyService;
import org.springframework.stereotype.Service;

@Service
public class HelloFourPolicyServiceImpl implements FourPolicyService {

    @Override
    public String print(HelloRequest helloRequest) {
        return helloRequest.getName() + "hello";
    }

}
