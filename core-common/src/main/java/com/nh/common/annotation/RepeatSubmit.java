package com.nh.common.annotation;

import java.lang.annotation.*;

/**
 * com.nh.common.annotation
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepeatSubmit {
}
