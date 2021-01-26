package com.nh.system.service;

import com.nh.common.core.domain.entity.SysMenu;
import com.nh.system.domain.vo.RouterVo;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * com.nh.system.service
 * create by admin nihui
 * create time 2021/1/25
 * version 1.0
 * 菜单服务
 **/
public interface ISysMenuService {
    Set<String> selectMenuPermsByUserId(Long userId);

    List<SysMenu> selectMenuTreeByUserId(Long userId);

    List<RouterVo> buildMenus(List<SysMenu> menus);
}
