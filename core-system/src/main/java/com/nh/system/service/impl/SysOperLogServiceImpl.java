package com.nh.system.service.impl;

import com.nh.system.domain.SysOperLog;
import com.nh.system.mapper.SysOperLogMapper;
import com.nh.system.service.ISysOperLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * com.nh.system.service.impl
 * create by admin nihui
 * create time 2021/1/27
 * version 1.0
 **/
@Service
public class SysOperLogServiceImpl implements ISysOperLogService {
    @Autowired
    private SysOperLogMapper operLogMapper;

    @Override
    public void insertOperlog(SysOperLog operLog) {
        operLogMapper.insert(operLog);
    }
}
