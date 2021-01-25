package com.nh.system.service;

import com.nh.common.core.domain.entity.SysUser;

/**
 * com.nh.system.service
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
public interface ISysUserService {
    SysUser selectUserByUserName(String username);
}
