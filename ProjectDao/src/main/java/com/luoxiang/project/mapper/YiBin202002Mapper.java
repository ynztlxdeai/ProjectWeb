package com.luoxiang.project.mapper;

import com.luoxiang.project.po.YiBin202002;
import com.luoxiang.project.po.YiBin202002Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YiBin202002Mapper {
    int countByExample(YiBin202002Example example);

    int deleteByExample(YiBin202002Example example);

    int deleteByPrimaryKey(Integer indexCode);

    int insert(YiBin202002 record);

    int insertSelective(YiBin202002 record);

    List<YiBin202002> selectByExample(YiBin202002Example example);

    YiBin202002 selectByPrimaryKey(Integer indexCode);

    int updateByExampleSelective(@Param("record") YiBin202002 record,
                                 @Param("example") YiBin202002Example example);

    int updateByExample(@Param("record") YiBin202002 record,
                        @Param("example") YiBin202002Example example);

    int updateByPrimaryKeySelective(YiBin202002 record);

    int updateByPrimaryKey(YiBin202002 record);

    List<YiBin202002> selectAll();
}