package com.renfakai.polymorphism.template.two.service.web;

import com.renfakai.polymorphism.dto.HelloRequest;
import com.renfakai.polymorphism.template.two.service.manager.ThreePolicyManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renfakai
 * 数据policy驱动业务处理
 * 缺点无法感知每个策略的处理
 */
@RequestMapping("/three")
@RestController
public class ThreePolicyController {

    @GetMapping("/policy")
    public String policy(HelloRequest request) {
        return ThreePolicyManager.getPolicy(request.getPolicy()).print(request);
    }

}
