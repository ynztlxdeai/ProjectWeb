package com.luoxiang.project.mapper;

import com.luoxiang.project.po.YunNan2022;
import com.luoxiang.project.po.YunNan2022Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YunNan2022Mapper {
    int countByExample(YunNan2022Example example);

    int deleteByExample(YunNan2022Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(YunNan2022 record);

    int insertSelective(YunNan2022 record);

    List<YunNan2022> selectByExample(YunNan2022Example example);

    YunNan2022 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") YunNan2022 record,
                                 @Param("example") YunNan2022Example example);

    int updateByExample(@Param("record") YunNan2022 record,
                        @Param("example") YunNan2022Example example);

    int updateByPrimaryKeySelective(YunNan2022 record);

    int updateByPrimaryKey(YunNan2022 record);

    List<YunNan2022> selectAll();
}