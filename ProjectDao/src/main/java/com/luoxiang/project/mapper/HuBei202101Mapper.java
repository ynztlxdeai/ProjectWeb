package com.luoxiang.project.mapper;

import com.luoxiang.project.po.HuBei202101;
import com.luoxiang.project.po.HuBei202101Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HuBei202101Mapper {
    int countByExample(HuBei202101Example example);

    int deleteByExample(HuBei202101Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(HuBei202101 record);

    int insertSelective(HuBei202101 record);

    List<HuBei202101> selectByExample(HuBei202101Example example);

    HuBei202101 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") HuBei202101 record,
                                 @Param("example") HuBei202101Example example);

    int updateByExample(@Param("record") HuBei202101 record,
                        @Param("example") HuBei202101Example example);

    int updateByPrimaryKeySelective(HuBei202101 record);

    int updateByPrimaryKey(HuBei202101 record);

    List<HuBei202101> selectAll();
}