package com.nh.web.controller.system;

import com.nh.common.constant.Constants;
import com.nh.common.core.controller.BaseController;
import com.nh.common.core.domain.AjaxResult;
import com.nh.common.core.domain.entity.SysUser;
import com.nh.common.core.domain.model.LoginBody;
import com.nh.common.utils.SecurityUtils;
import com.nh.framework.web.service.SysLoginService;
import com.nh.framework.web.service.TokenService;
import com.nh.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.nh.web.controller.system
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
@RestController
public class SysLoginController extends BaseController {

    @Autowired
    private SysLoginService loginService;
    @Autowired
    private ISysUserService userService;


    @Autowired
    private TokenService tokenService;

    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody)
    {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
                loginBody.getUuid());
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }


}