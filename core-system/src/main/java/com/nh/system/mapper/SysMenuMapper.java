package com.nh.system.mapper;

import com.nh.common.core.domain.entity.SysMenu;
import com.nh.common.core.domain.entity.SysMenuExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface SysMenuMapper extends Serializable {
    long countByExample(SysMenuExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    SysMenu selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> selectMenuTreeByUserId(Long userId);

    List<SysMenu> selectMenuListByUserId(SysMenu sysMenu);

    /**
     * 根据用户ID查询菜单
     *
     * @return 菜单列表
     */
    public List<SysMenu> selectMenuTreeAll();

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    public List<String> selectMenuPermsByUserId(Long userId);




}