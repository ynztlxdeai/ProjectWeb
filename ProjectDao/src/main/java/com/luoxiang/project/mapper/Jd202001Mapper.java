package com.luoxiang.project.mapper;

import com.luoxiang.project.po.Jd202001;
import com.luoxiang.project.po.Jd202001Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Jd202001Mapper {
    int countByExample(Jd202001Example example);

    int deleteByExample(Jd202001Example example);

    int insert(Jd202001 record);

    int insertSelective(Jd202001 record);

    List<Jd202001> selectByExample(Jd202001Example example);

    int updateByExampleSelective(@Param("record") Jd202001 record,
                                 @Param("example") Jd202001Example example);

    int updateByExample(@Param("record") Jd202001 record, @Param("example") Jd202001Example example);

    List<Jd202001> selectAll();
}