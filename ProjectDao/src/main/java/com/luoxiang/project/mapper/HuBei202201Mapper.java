package com.luoxiang.project.mapper;

import com.luoxiang.project.po.HuBei202201;
import com.luoxiang.project.po.HuBei202201Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HuBei202201Mapper {
    int countByExample(HuBei202201Example example);

    int deleteByExample(HuBei202201Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(HuBei202201 record);

    int insertSelective(HuBei202201 record);

    List<HuBei202201> selectByExample(HuBei202201Example example);

    HuBei202201 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") HuBei202201 record,
                                 @Param("example") HuBei202201Example example);

    int updateByExample(@Param("record") HuBei202201 record,
                        @Param("example") HuBei202201Example example);

    int updateByPrimaryKeySelective(HuBei202201 record);

    int updateByPrimaryKey(HuBei202201 record);

    List<HuBei202201> selectAll();
}