package com.renfakai.polymorphism.template.three.service.manager;

import com.renfakai.polymorphism.template.three.annotation.PolicyEnum;
import com.renfakai.polymorphism.template.three.annotation.PolicyType;
import com.renfakai.polymorphism.template.two.service.ThreePolicyService;
import com.renfakai.polymorphism.template.two.service.manager.ThreePolicyManager;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class SpringThreePolicyManager implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        PolicyType policyType = AnnotationUtils.findAnnotation(bean.getClass(), PolicyType.class);
        if (Objects.nonNull(policyType)) {
            PolicyEnum policyEnum = policyType.value();
            ThreePolicyManager.register(policyEnum.getCode(), (ThreePolicyService) bean);
        }
        return bean;
    }

}
