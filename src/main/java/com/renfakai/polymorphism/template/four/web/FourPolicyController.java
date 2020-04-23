package com.renfakai.polymorphism.template.four.web;

import com.renfakai.polymorphism.conf.ApplicationContextProvider;
import com.renfakai.polymorphism.dto.HelloRequest;
import com.renfakai.polymorphism.template.four.dict.FourPolicyNameEnum;
import com.renfakai.polymorphism.template.four.service.FourPolicyService;
import com.renfakai.polymorphism.template.two.service.manager.ThreePolicyManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/four")
@RestController
public class FourPolicyController {

    @GetMapping("/policy")
    public String policy(HelloRequest request) {
        FourPolicyService fourPolicyService = (FourPolicyService) ApplicationContextProvider.getBean(FourPolicyNameEnum.getPolicyName(request.getPolicy()));
        String print = fourPolicyService.print(request);
        log.info("result:{}", print);
        return print;
    }

}
