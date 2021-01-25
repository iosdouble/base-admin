package com.nh.common.exception.user;

import com.nh.common.exception.BaseException;

/**
 * com.nh.common.exception
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
