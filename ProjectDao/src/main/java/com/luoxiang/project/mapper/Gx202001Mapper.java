package com.luoxiang.project.mapper;

import com.luoxiang.project.po.Gx202001;
import com.luoxiang.project.po.Gx202001Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Gx202001Mapper {
    int countByExample(Gx202001Example example);

    int deleteByExample(Gx202001Example example);

    int deleteByPrimaryKey(Integer indexId);

    int insert(Gx202001 record);

    int insertSelective(Gx202001 record);

    List<Gx202001> selectByExample(Gx202001Example example);

    Gx202001 selectByPrimaryKey(Integer indexId);

    int updateByExampleSelective(@Param("record") Gx202001 record,
                                 @Param("example") Gx202001Example example);

    int updateByExample(@Param("record") Gx202001 record, @Param("example") Gx202001Example example);

    int updateByPrimaryKeySelective(Gx202001 record);

    int updateByPrimaryKey(Gx202001 record);

    List<Gx202001> selectAll();
}