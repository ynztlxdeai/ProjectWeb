package com.luoxiang.project.mapper;

import com.luoxiang.project.po.Sc202001;
import com.luoxiang.project.po.Sc202001Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Sc202001Mapper {
    int countByExample(Sc202001Example example);

    int deleteByExample(Sc202001Example example);

    int deleteByPrimaryKey(Integer indexId);

    int insert(Sc202001 record);

    int insertSelective(Sc202001 record);

    List<Sc202001> selectByExample(Sc202001Example example);

    Sc202001 selectByPrimaryKey(Integer indexId);

    int updateByExampleSelective(@Param("record") Sc202001 record,
                                 @Param("example") Sc202001Example example);

    int updateByExample(@Param("record") Sc202001 record, @Param("example") Sc202001Example example);

    int updateByPrimaryKeySelective(Sc202001 record);

    int updateByPrimaryKey(Sc202001 record);

    List<Sc202001> selectAll();
}