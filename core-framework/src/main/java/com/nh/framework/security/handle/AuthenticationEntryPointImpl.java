package com.nh.framework.security.handle;

import com.alibaba.fastjson.JSON;
import com.nh.common.constant.HttpStatus;
import com.nh.common.core.domain.AjaxResult;
import com.nh.common.utils.ServletUtils;
import com.nh.common.utils.StringUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * com.nh.framework.security.handle
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 * 认证失败处理类，返回未授权
 **/
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint, Serializable {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        int code = HttpStatus.UNAUTHORIZED;
        String msg = StringUtils.format("请求访问:{},认证失败，无法访问系统资源",request.getRequestURI());
        ServletUtils.renderString(response, JSON.toJSONString(AjaxResult.error(code,msg)));
    }
}
