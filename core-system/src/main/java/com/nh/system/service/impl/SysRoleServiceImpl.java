package com.nh.system.service.impl;

import com.nh.common.core.domain.entity.SysRole;
import com.nh.common.utils.StringUtils;
import com.nh.system.mapper.SysRoleMapper;
import com.nh.system.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * com.nh.system.service.impl
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
@Service
public class SysRoleServiceImpl implements ISysRoleService {

    @Autowired
    private SysRoleMapper roleMapper;

    @Override
    public Set<String> selectRolePermissionByUserId(Long userId) {
        List<SysRole> perms = roleMapper.selectRolePermissionByUserId(userId);
        Set<String> permsSet = new HashSet<>();
        for (SysRole perm : perms)
        {
            if (StringUtils.isNotNull(perm))
            {
                permsSet.addAll(Arrays.asList(perm.getRoleKey().trim().split(",")));
            }
        }
        return permsSet;
    }
}
