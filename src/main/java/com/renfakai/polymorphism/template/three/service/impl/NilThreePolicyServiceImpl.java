package com.renfakai.polymorphism.template.two.service.impl;

import com.renfakai.polymorphism.dto.HelloRequest;
import com.renfakai.polymorphism.template.three.annotation.PolicyEnum;
import com.renfakai.polymorphism.template.three.annotation.PolicyType;
import com.renfakai.polymorphism.template.three.service.impl.ThreePolicyAdapt;
import com.renfakai.polymorphism.template.two.service.ThreePolicyService;
import com.renfakai.polymorphism.template.two.service.manager.ThreePolicyManager;
import org.springframework.stereotype.Service;

@PolicyType(PolicyEnum.NIL)
public class NilThreePolicyServiceImpl extends ThreePolicyAdapt {

    @Override
    public String print(HelloRequest helloRequest) {
        return ThreePolicyManager.NIL;
    }

}
