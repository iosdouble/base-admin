package com.nh.common.utils;

/**
 * com.nh.common.utils
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 * 处理并记录日志文件
 **/
public class LogUtils {

    public static String getBlock(Object msg)
    {
        if (msg == null)
        {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }
}
