package com.nh.framework.web.service;

import com.nh.common.core.domain.entity.SysUser;
import com.nh.system.service.ISysMenuService;
import com.nh.system.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * com.nh.framework.web.service
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
@Component
public class SysPermissionService {
    @Autowired
    private ISysRoleService roleService;

    @Autowired
    private ISysMenuService menuService;

    public Set<String> getMenuPermission(SysUser user) {
        return null;
    }
}
