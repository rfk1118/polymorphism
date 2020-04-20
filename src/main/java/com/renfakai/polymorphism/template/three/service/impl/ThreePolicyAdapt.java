package com.renfakai.polymorphism.template.three.service.impl;

import com.renfakai.polymorphism.template.three.annotation.PolicyType;
import com.renfakai.polymorphism.template.two.service.ThreePolicyService;
import com.renfakai.polymorphism.template.two.service.manager.ThreePolicyManager;

import java.util.Objects;

public abstract class ThreePolicyAdapt implements ThreePolicyService {

    @Override
    public void afterPropertiesSet() throws Exception {
        PolicyType annotation = this.getClass().getAnnotation(PolicyType.class);
        if (Objects.nonNull(annotation)) {
            ThreePolicyManager.register(annotation.value().getCode(), this);
        }
    }
}
