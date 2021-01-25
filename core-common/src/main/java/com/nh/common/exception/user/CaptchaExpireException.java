package com.nh.common.exception.user;



/**
 * com.nh.common.exception.user
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 * 验证码失效异常
 **/
public class CaptchaExpireException extends UserException {
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.jcaptcha.expire", null);
    }
}
