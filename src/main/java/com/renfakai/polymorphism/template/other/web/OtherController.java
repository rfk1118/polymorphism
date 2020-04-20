package com.renfakai.polymorphism.template.other.one.web;

import com.renfakai.polymorphism.dto.HelloRequest;
import com.renfakai.polymorphism.template.other.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renfakai
 * 不能数据驱动业务
 */
@RequestMapping("/other")
@RestController
public class OtherController {

    @Autowired
    private OtherService otherService;

    @GetMapping("/hello")
    public String hello(HelloRequest request) {
        return otherService.print(request);
    }
}
