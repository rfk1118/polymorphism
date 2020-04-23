package com.renfakai.polymorphism.template.four.service.impl;

import com.renfakai.polymorphism.dto.HelloRequest;
import com.renfakai.polymorphism.template.four.service.FourPolicyService;
import com.renfakai.polymorphism.template.two.service.ThreePolicyService;
import com.renfakai.polymorphism.template.two.service.manager.ThreePolicyManager;
import org.springframework.stereotype.Service;

@Service
public class NilFourPolicyServiceImpl implements FourPolicyService {

    @Override
    public String print(HelloRequest helloRequest) {
        return ThreePolicyManager.NIL;
    }

}
