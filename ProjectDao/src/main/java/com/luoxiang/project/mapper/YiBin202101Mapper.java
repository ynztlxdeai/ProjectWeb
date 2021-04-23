package com.luoxiang.project.mapper;

import com.luoxiang.project.po.YiBin202101;
import com.luoxiang.project.po.YiBin202101Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YiBin202101Mapper {
    int countByExample(YiBin202101Example example);

    int deleteByExample(YiBin202101Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(YiBin202101 record);

    int insertSelective(YiBin202101 record);

    List<YiBin202101> selectByExample(YiBin202101Example example);

    YiBin202101 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") YiBin202101 record,
                                 @Param("example") YiBin202101Example example);

    int updateByExample(@Param("record") YiBin202101 record,
                        @Param("example") YiBin202101Example example);

    int updateByPrimaryKeySelective(YiBin202101 record);

    int updateByPrimaryKey(YiBin202101 record);

    List<YiBin202101> selectAll();
}