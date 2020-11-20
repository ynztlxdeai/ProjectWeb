package com.luoxiang.project.mapper;

import com.luoxiang.project.po.ShanDong202002;
import com.luoxiang.project.po.ShanDong202002Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShanDong202002Mapper {
    int countByExample(ShanDong202002Example example);

    int deleteByExample(ShanDong202002Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(ShanDong202002 record);

    int insertSelective(ShanDong202002 record);

    List<ShanDong202002> selectByExample(ShanDong202002Example example);

    ShanDong202002 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") ShanDong202002 record,
                                 @Param("example") ShanDong202002Example example);

    int updateByExample(@Param("record") ShanDong202002 record,
                        @Param("example") ShanDong202002Example example);

    int updateByPrimaryKeySelective(ShanDong202002 record);

    int updateByPrimaryKey(ShanDong202002 record);

    List<ShanDong202002> selectAll();
}