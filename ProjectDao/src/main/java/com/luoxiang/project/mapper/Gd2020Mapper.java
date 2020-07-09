package com.luoxiang.project.mapper;

import com.luoxiang.project.po.Gd2020;
import com.luoxiang.project.po.Gd2020Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Gd2020Mapper {
    int countByExample(Gd2020Example example);

    int deleteByExample(Gd2020Example example);

    int deleteByPrimaryKey(Integer indexId);

    int insert(Gd2020 record);

    int insertSelective(Gd2020 record);

    List<Gd2020> selectByExample(Gd2020Example example);

    Gd2020 selectByPrimaryKey(Integer indexId);

    int updateByExampleSelective(@Param("record") Gd2020 record,
                                 @Param("example") Gd2020Example example);

    int updateByExample(@Param("record") Gd2020 record, @Param("example") Gd2020Example example);

    int updateByPrimaryKeySelective(Gd2020 record);

    int updateByPrimaryKey(Gd2020 record);

    List<Gd2020> selectAll();
}