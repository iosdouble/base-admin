package com.nh.web.controller.system;

import com.nh.common.constant.Constants;
import com.nh.common.core.controller.BaseController;
import com.nh.common.core.domain.AjaxResult;
import com.nh.common.core.domain.entity.SysMenu;
import com.nh.common.core.domain.entity.SysUser;
import com.nh.common.core.domain.model.LoginBody;
import com.nh.common.core.domain.model.LoginUser;
import com.nh.common.utils.SecurityUtils;
import com.nh.common.utils.ServletUtils;
import com.nh.common.utils.json.JsonUtil;
import com.nh.framework.web.service.SysLoginService;
import com.nh.framework.web.service.SysPermissionService;
import com.nh.framework.web.service.TokenService;
import com.nh.framework.web.service.UserDetailsServiceImpl;
import com.nh.system.service.ISysMenuService;
import com.nh.system.service.ISysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * com.nh.web.controller.system
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 **/
@RestController
public class SysLoginController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger("sys-user");

    @Autowired
    private SysLoginService loginService;
    @Autowired
    private ISysUserService userService;
    @Autowired
    private ISysMenuService menuService;
    @Autowired
    private SysPermissionService permissionService;

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
        log.debug("user login {}", JsonUtil.toJson(loginBody));
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
                loginBody.getUuid());
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    @GetMapping("getInfo")
    public AjaxResult getInfo()
    {
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        SysUser user = loginUser.getUser();
        // 角色集合
        Set<String> roles = permissionService.getRolePermission(user);
        // 权限集合
        Set<String> permissions = permissionService.getMenuPermission(user);
        AjaxResult ajax = AjaxResult.success();
        ajax.put("user", user);
        ajax.put("roles", roles);
        ajax.put("permissions", permissions);
        log.debug("reback userinfo is {}",JsonUtil.toJson(ajax));
        return ajax;
    }

    /**
     * 获取路由信息
     *
     * @return 路由信息
     */
    @GetMapping("getRouters")
    public AjaxResult getRouters()
    {
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        // 用户信息
        SysUser user = loginUser.getUser();
        List<SysMenu> menus = menuService.selectMenuTreeByUserId(user.getUserId());
        return AjaxResult.success(menuService.buildMenus(menus));
    }


}
