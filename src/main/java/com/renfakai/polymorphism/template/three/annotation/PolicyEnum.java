package com.renfakai.polymorphism.template.three.annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author renfakai
 * desc的形容
 */
@Getter
@AllArgsConstructor
public enum PolicyEnum {

    HELLO("hello", "helloPolicy"),

    WORLD("world", "worldPolicy"),

    NIL("Nil", "NilPolicy"),

    ;

    private final String code;
    private final String desc;
}
