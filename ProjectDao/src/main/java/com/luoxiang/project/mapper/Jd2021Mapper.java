package com.luoxiang.project.mapper;

import com.luoxiang.project.po.Jd2021;
import com.luoxiang.project.po.Jd2021Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Jd2021Mapper {
    int countByExample(Jd2021Example example);

    int deleteByExample(Jd2021Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(Jd2021 record);

    int insertSelective(Jd2021 record);

    List<Jd2021> selectByExample(Jd2021Example example);

    Jd2021 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") Jd2021 record,
                                 @Param("example") Jd2021Example example);

    int updateByExample(@Param("record") Jd2021 record, @Param("example") Jd2021Example example);

    int updateByPrimaryKeySelective(Jd2021 record);

    int updateByPrimaryKey(Jd2021 record);

    List<Jd2021> selectAll();
}