package com.renfakai.polymorphism.template.four.dict;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

@Getter
@AllArgsConstructor
public enum FourPolicyNameEnum {

    HELLO("hello", "helloFourPolicyServiceImpl"),

    WORLD("world", "worldFourPolicyServiceImpl"),

    NIL("Nil", "nilFourPolicyServiceImpl"),

    ;

    private final String code;
    private final String policyName;


    public static String getPolicyName(String code) {
        if (StringUtils.isEmpty(code)) {
            return NIL.getPolicyName();
        }

        for (FourPolicyNameEnum value : FourPolicyNameEnum.values()) {
            if (value.getCode().equals(code)) {
                return value.getPolicyName();
            }
        }

        return NIL.getPolicyName();
    }


}
