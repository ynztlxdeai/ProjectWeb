package com.luoxiang.project.mapper;

import com.luoxiang.project.po.JiangSu2022;
import com.luoxiang.project.po.JiangSu2022Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JiangSu2022Mapper {
    int countByExample(JiangSu2022Example example);

    int deleteByExample(JiangSu2022Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(JiangSu2022 record);

    int insertSelective(JiangSu2022 record);

    List<JiangSu2022> selectByExample(JiangSu2022Example example);

    JiangSu2022 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") JiangSu2022 record,
                                 @Param("example") JiangSu2022Example example);

    int updateByExample(@Param("record") JiangSu2022 record,
                        @Param("example") JiangSu2022Example example);

    int updateByPrimaryKeySelective(JiangSu2022 record);

    int updateByPrimaryKey(JiangSu2022 record);

    List<JiangSu2022> selectAll();
}