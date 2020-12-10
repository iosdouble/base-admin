package com.nh.activiti.listeners;

import io.micrometer.core.instrument.util.JsonUtils;
import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

/**
 * com.nh.activiti.listeners
 * create by admin nihui
 * create time 2020/12/10
 * version 1.0
 **/

public class TaskListenerImpl implements TaskListener {


    @Override
    public void notify(DelegateTask delegateTask) {
        User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = principal.getUsername();
        System.out.println(principal.getUsername());
        String name = delegateTask.getName();
        System.out.println(name);
        delegateTask.setAssignee(username);
    }
}
