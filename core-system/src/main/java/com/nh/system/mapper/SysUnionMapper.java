package com.nh.system.mapper;

import com.nh.common.core.domain.entity.SysUnion;
import com.nh.common.core.domain.entity.SysUnionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface SysUnionMapper extends Serializable {
    long countByExample(SysUnionExample example);

    int deleteByPrimaryKey(Long unionId);

    int insert(SysUnion record);

    int insertSelective(SysUnion record);

    List<SysUnion> selectByExample(SysUnionExample example);

    SysUnion selectByPrimaryKey(Long unionId);

    int updateByExampleSelective(@Param("record") SysUnion record, @Param("example") SysUnionExample example);

    int updateByExample(@Param("record") SysUnion record, @Param("example") SysUnionExample example);

    int updateByPrimaryKeySelective(SysUnion record);

    int updateByPrimaryKey(SysUnion record);
}