package com.renfakai.polymorphism.template.three.annotation;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Component
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public  @interface PolicyType {


    @NonNull
    PolicyEnum value();

}
