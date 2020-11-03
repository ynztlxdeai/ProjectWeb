package com.luoxiang.project.mapper;

import com.luoxiang.project.po.JiangSu202002;
import com.luoxiang.project.po.JiangSu202002Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JiangSu202002Mapper {
    int countByExample(JiangSu202002Example example);

    int deleteByExample(JiangSu202002Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(JiangSu202002 record);

    int insertSelective(JiangSu202002 record);

    List<JiangSu202002> selectByExample(JiangSu202002Example example);

    JiangSu202002 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") JiangSu202002 record,
                                 @Param("example") JiangSu202002Example example);

    int updateByExample(@Param("record") JiangSu202002 record,
                        @Param("example") JiangSu202002Example example);

    int updateByPrimaryKeySelective(JiangSu202002 record);

    int updateByPrimaryKey(JiangSu202002 record);

    List<JiangSu202002> selectAll();
}