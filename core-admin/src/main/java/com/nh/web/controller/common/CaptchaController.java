package com.nh.web.controller.common;

import com.google.code.kaptcha.Producer;
import com.nh.common.core.redis.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.nh.web.controller.common
 * create by admin nihui
 * create time 2020/12/4
 * version 1.0
 * 验证码操作处理
 **/
@RestController
public class CaptchaController {
    @Resource(name = "captchaProducer")
    private Producer captchaProducer;

    @Resource(name = "captchaProducerMath")
    private Producer captchaProducerMath;

    @Autowired
    private RedisCache redisCache;

    // 验证码类型
    @Value("${nh.captchaType}")
    private String captchaType;
}
