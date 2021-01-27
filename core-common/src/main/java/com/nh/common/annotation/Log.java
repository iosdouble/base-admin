package com.nh.common.annotation;

import com.nh.common.enums.BusinessType;
import com.nh.common.enums.OperatorType;

import java.lang.annotation.*;

/**
 * com.nh.common.annotation
 * create by admin nihui
 * create time 2021/1/27
 * version 1.0
 * 自定义 操作日志记录注解
 **/
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * 模块
     */
    public String title() default "";

    /**
     * 功能
     */
    public BusinessType businessType() default BusinessType.OTHER;

    /**
     * 操作人类别
     */
    public OperatorType operatorType() default OperatorType.MANAGE;

    /**
     * 是否保存请求的参数
     */
    public boolean isSaveRequestData() default true;
}
