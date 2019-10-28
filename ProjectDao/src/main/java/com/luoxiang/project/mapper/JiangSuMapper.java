package com.luoxiang.project.mapper;

import com.luoxiang.project.po.JiangSu;
import com.luoxiang.project.po.JiangSuExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JiangSuMapper {
    int countByExample(JiangSuExample example);

    int deleteByExample(JiangSuExample example);

    int deleteByPrimaryKey(Integer indexId);

    int insert(JiangSu record);

    int insertSelective(JiangSu record);

    List<JiangSu> selectByExample(JiangSuExample example);

    JiangSu selectByPrimaryKey(Integer indexId);

    int updateByExampleSelective(@Param("record") JiangSu record,
                                 @Param("example") JiangSuExample example);

    int updateByExample(@Param("record") JiangSu record, @Param("example") JiangSuExample example);

    int updateByPrimaryKeySelective(JiangSu record);

    int updateByPrimaryKey(JiangSu record);

    List<JiangSu> selectAll();
}