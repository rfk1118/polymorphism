package com.renfakai.polymorphism.template.two.service.manager;

import com.renfakai.polymorphism.template.two.service.ThreePolicyService;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author renfakai
 */
public final class TwoPolicyManager {

    public static final String NIL = "Nil";

    private static final Map<String, ThreePolicyService> CONTAINER = new HashMap<>();


    public static boolean register(String key, ThreePolicyService service) {
        return CONTAINER.put(key, service) != null;
    }

    public static ThreePolicyService getPolicy(String channel) {
        ThreePolicyService policyService = CONTAINER.get(channel);
        if (Objects.isNull(policyService)) {
            return CONTAINER.get(NIL);
        }
        return policyService;
    }

}
