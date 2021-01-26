package com.nh.system.service;

import java.util.Collection;
import java.util.Set;

/**
 * com.nh.system.service
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
public interface ISysRoleService {
    Set<String> selectRolePermissionByUserId(Long userId);
}
