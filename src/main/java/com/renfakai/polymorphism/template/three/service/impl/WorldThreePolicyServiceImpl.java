package com.renfakai.polymorphism.template.two.service.impl;

import com.renfakai.polymorphism.dto.HelloRequest;
import com.renfakai.polymorphism.template.three.annotation.PolicyEnum;
import com.renfakai.polymorphism.template.three.annotation.PolicyType;
import com.renfakai.polymorphism.template.three.service.impl.ThreePolicyAdapt;

@PolicyType(PolicyEnum.WORLD)
public class WorldThreePolicyServiceImpl extends ThreePolicyAdapt {
    @Override
    public String print(HelloRequest helloRequest) {
        return helloRequest.getName() + "world";
    }
}
