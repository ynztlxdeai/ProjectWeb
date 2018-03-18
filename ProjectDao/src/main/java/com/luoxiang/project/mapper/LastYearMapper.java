package com.luoxiang.project.mapper;

import com.luoxiang.project.po.Baomingqingkuang;
import com.luoxiang.project.po.LastYear;
import com.luoxiang.project.po.LastYearExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LastYearMapper {
    int countByExample(LastYearExample example);

    int deleteByExample(LastYearExample example);

    int deleteByPrimaryKey(Integer jobId);

    int insert(LastYear record);

    int insertSelective(LastYear record);

    List<LastYear> selectByExample(LastYearExample example);

    LastYear selectByPrimaryKey(Integer jobId);

    int updateByExampleSelective(@Param("record") LastYear record,
                                 @Param("example") LastYearExample example);

    int updateByExample(@Param("record") LastYear record, @Param("example") LastYearExample example);

    int updateByPrimaryKeySelective(LastYear record);

    int updateByPrimaryKey(LastYear record);

        List<Baomingqingkuang> selectAll();
}