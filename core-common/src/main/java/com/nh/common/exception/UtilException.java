package com.nh.common.exception;

/**
 * @Classname UtilException
 * @Description TODO
 * @Date 2020/12/4 8:18 PM
 * @Created by nihui
 * @Version 1.0
 * @Description UtilException @see base-admin
 */
public class UtilException extends RuntimeException {
    public UtilException(Throwable e)
    {
        super(e.getMessage(), e);
    }

    public UtilException(String message)
    {
        super(message);
    }

    public UtilException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
}
