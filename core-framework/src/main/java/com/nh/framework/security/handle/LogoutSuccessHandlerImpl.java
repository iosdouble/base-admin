package com.nh.framework.security.handle;

import com.alibaba.fastjson.JSON;
import com.nh.common.constant.Constants;
import com.nh.common.constant.HttpStatus;
import com.nh.common.core.domain.AjaxResult;
import com.nh.common.core.domain.model.LoginUser;
import com.nh.common.utils.ServletUtils;
import com.nh.common.utils.StringUtils;
import com.nh.framework.manager.AsyncManager;
import com.nh.framework.manager.factory.AsyncFactory;
import com.nh.framework.web.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * com.nh.framework.security.handle
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
@Configuration
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler {

    @Autowired
    private TokenService tokenService;

    /**
     * 进行推出处理的操作
     * @param request
     * @param response
     * @param authentication
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        LoginUser loginUser = tokenService.getLoginUser(request);
        if (StringUtils.isNotNull(loginUser)){
            // 获取用户名
            String userName = loginUser.getUsername();
            // 删除用户缓存记录
            tokenService.delLoginUser(loginUser.getToken());
            // 记录用户退出日志
            AsyncManager.me().execute(AsyncFactory.recordLogininfor(userName, Constants.LOGOUT,"退出成功"));
        }
        ServletUtils.renderString(response, JSON.toJSONString(AjaxResult.error(HttpStatus.SUCCESS,"退出成功")));
    }
}
