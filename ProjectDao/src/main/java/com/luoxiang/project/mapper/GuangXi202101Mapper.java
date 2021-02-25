package com.luoxiang.project.mapper;

import com.luoxiang.project.po.GuangXi202101;
import com.luoxiang.project.po.GuangXi202101Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuangXi202101Mapper {
    int countByExample(GuangXi202101Example example);

    int deleteByExample(GuangXi202101Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(GuangXi202101 record);

    int insertSelective(GuangXi202101 record);

    List<GuangXi202101> selectByExample(GuangXi202101Example example);

    GuangXi202101 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") GuangXi202101 record,
                                 @Param("example") GuangXi202101Example example);

    int updateByExample(@Param("record") GuangXi202101 record,
                        @Param("example") GuangXi202101Example example);

    int updateByPrimaryKeySelective(GuangXi202101 record);

    int updateByPrimaryKey(GuangXi202101 record);

    List<GuangXi202101> selectAll();
}