package com.luoxiang.project.mapper;

import com.luoxiang.project.po.SDGov;
import com.luoxiang.project.po.SDGovExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SDGovMapper {
    int countByExample(SDGovExample example);

    int deleteByExample(SDGovExample example);

    int deleteByPrimaryKey(Integer position);

    int insert(SDGov record);

    int insertSelective(SDGov record);

    List<SDGov> selectByExample(SDGovExample example);

    SDGov selectByPrimaryKey(Integer position);

    int updateByExampleSelective(@Param("record") SDGov record,
                                 @Param("example") SDGovExample example);

    int updateByExample(@Param("record") SDGov record, @Param("example") SDGovExample example);

    int updateByPrimaryKeySelective(SDGov record);

    int updateByPrimaryKey(SDGov record);

    List<SDGov> selectAll();
}