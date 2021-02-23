package com.luoxiang.project.mapper;

import com.luoxiang.project.po.YunNan202101;
import com.luoxiang.project.po.YunNan202101Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YunNan202101Mapper {
    int countByExample(YunNan202101Example example);

    int deleteByExample(YunNan202101Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(YunNan202101 record);

    int insertSelective(YunNan202101 record);

    List<YunNan202101> selectByExample(YunNan202101Example example);

    YunNan202101 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") YunNan202101 record,
                                 @Param("example") YunNan202101Example example);

    int updateByExample(@Param("record") YunNan202101 record,
                        @Param("example") YunNan202101Example example);

    int updateByPrimaryKeySelective(YunNan202101 record);

    int updateByPrimaryKey(YunNan202101 record);

    List<YunNan202101> selectAll();
}