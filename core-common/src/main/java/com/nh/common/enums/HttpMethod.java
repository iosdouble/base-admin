package com.nh.common.enums;

import org.springframework.lang.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * com.nh.common.enums
 * create by admin nihui
 * create time 2021/1/27
 * version 1.0
 **/
public enum HttpMethod {
    GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE;

    private static final Map<String, HttpMethod> mappings = new HashMap<>(16);

    static
    {
        for (HttpMethod httpMethod : values())
        {
            mappings.put(httpMethod.name(), httpMethod);
        }
    }

    @Nullable
    public static HttpMethod resolve(@Nullable String method)
    {
        return (method != null ? mappings.get(method) : null);
    }

    public boolean matches(String method)
    {
        return (this == resolve(method));
    }
}
