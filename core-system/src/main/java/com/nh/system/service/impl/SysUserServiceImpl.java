package com.nh.system.service.impl;

import com.nh.common.core.domain.entity.SysUser;
import com.nh.common.core.domain.entity.SysUserExample;
import com.nh.system.mapper.SysUserMapper;
import com.nh.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * com.nh.system.service.impl
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper userMapper;


    @Override
    public SysUser selectUserByUserName(String username) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria().andUserNameEqualTo(username);
        List<SysUser> sysUsers = userMapper.selectByExample(sysUserExample);
        if (sysUsers.size()>0){
            return sysUsers.get(0);
        }else {
            throw new UsernameNotFoundException("登录用户：" + username + " 不存在");
        }
    }
}
