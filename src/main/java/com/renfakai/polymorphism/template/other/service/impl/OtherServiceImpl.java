package com.renfakai.polymorphism.template.other.service.impl;

import com.renfakai.polymorphism.dto.HelloRequest;
import com.renfakai.polymorphism.template.other.service.OtherService;
import org.springframework.stereotype.Service;


@Service
public class OtherServiceImpl implements OtherService {

    @Override
    public String print(HelloRequest helloRequest) {

        if ("hello".equalsIgnoreCase(helloRequest.getPolicy())) {
            return helloRequest.getName() + "hello";
        }

        return helloRequest.getName() + "world";
    }


}
