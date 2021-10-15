package com.luoxiang.project.mapper;

import com.luoxiang.project.po.SiChuan202102;
import com.luoxiang.project.po.SiChuan202102Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SiChuan202102Mapper {
    int countByExample(SiChuan202102Example example);

    int deleteByExample(SiChuan202102Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(SiChuan202102 record);

    int insertSelective(SiChuan202102 record);

    List<SiChuan202102> selectByExample(SiChuan202102Example example);

    SiChuan202102 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") SiChuan202102 record,
                                 @Param("example") SiChuan202102Example example);

    int updateByExample(@Param("record") SiChuan202102 record,
                        @Param("example") SiChuan202102Example example);

    int updateByPrimaryKeySelective(SiChuan202102 record);

    int updateByPrimaryKey(SiChuan202102 record);

    List<SiChuan202102> selectAll();
}