package com.luoxiang.project.mapper;

import com.luoxiang.project.po.ShanXi01;
import com.luoxiang.project.po.ShanXi01Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShanXi01Mapper {
    int countByExample(ShanXi01Example example);

    int deleteByExample(ShanXi01Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(ShanXi01 record);

    int insertSelective(ShanXi01 record);

    List<ShanXi01> selectByExample(ShanXi01Example example);

    ShanXi01 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") ShanXi01 record,
                                 @Param("example") ShanXi01Example example);

    int updateByExample(@Param("record") ShanXi01 record, @Param("example") ShanXi01Example example);

    int updateByPrimaryKeySelective(ShanXi01 record);

    int updateByPrimaryKey(ShanXi01 record);

    List<ShanXi01> selectAll();
}