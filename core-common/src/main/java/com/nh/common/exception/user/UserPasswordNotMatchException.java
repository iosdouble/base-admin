package com.nh.common.exception.user;

/**
 * com.nh.common.exception.user
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
public class UserPasswordNotMatchException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException()
    {
        super("user.password.not.match", null);
    }
}
