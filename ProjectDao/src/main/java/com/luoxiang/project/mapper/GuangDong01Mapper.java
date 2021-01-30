package com.luoxiang.project.mapper;

import com.luoxiang.project.po.GuangDong01;
import com.luoxiang.project.po.GuangDong01Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuangDong01Mapper {
    int countByExample(GuangDong01Example example);

    int deleteByExample(GuangDong01Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(GuangDong01 record);

    int insertSelective(GuangDong01 record);

    List<GuangDong01> selectByExample(GuangDong01Example example);

    GuangDong01 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") GuangDong01 record,
                                 @Param("example") GuangDong01Example example);

    int updateByExample(@Param("record") GuangDong01 record,
                        @Param("example") GuangDong01Example example);

    int updateByPrimaryKeySelective(GuangDong01 record);

    int updateByPrimaryKey(GuangDong01 record);

    List<GuangDong01> selectAll();
}