package com.luoxiang.project.mapper;

import com.luoxiang.project.po.HeNan202101;
import com.luoxiang.project.po.HeNan202101Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HeNan202101Mapper {
    int countByExample(HeNan202101Example example);

    int deleteByExample(HeNan202101Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(HeNan202101 record);

    int insertSelective(HeNan202101 record);

    List<HeNan202101> selectByExample(HeNan202101Example example);

    HeNan202101 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") HeNan202101 record,
                                 @Param("example") HeNan202101Example example);

    int updateByExample(@Param("record") HeNan202101 record,
                        @Param("example") HeNan202101Example example);

    int updateByPrimaryKeySelective(HeNan202101 record);

    int updateByPrimaryKey(HeNan202101 record);

    List<HeNan202101> selectAll();
}