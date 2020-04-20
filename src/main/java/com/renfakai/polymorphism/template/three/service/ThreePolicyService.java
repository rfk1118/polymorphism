package com.renfakai.polymorphism.template.two.service;

import com.renfakai.polymorphism.dto.HelloRequest;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author renfakai
 * 缺点,需要在每个实现里面都实现,但是符合ocp原则
 *     @Override
 *     public void afterPropertiesSet() throws Exception {
 *         TwoPolicyManager.register("hello", this);
 *     }
 */
public interface ThreePolicyService extends InitializingBean {


    /**
     * @param helloRequest 请求
     */
    String print(HelloRequest helloRequest);
}
