package com.luoxiang.project.mapper;

import com.luoxiang.project.po.ZheJiang02;
import com.luoxiang.project.po.ZheJiang02Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZheJiang02Mapper {
    int countByExample(ZheJiang02Example example);

    int deleteByExample(ZheJiang02Example example);

    int deleteByPrimaryKey(Integer priId);

    int insert(ZheJiang02 record);

    int insertSelective(ZheJiang02 record);

    List<ZheJiang02> selectByExample(ZheJiang02Example example);

    ZheJiang02 selectByPrimaryKey(Integer priId);

    int updateByExampleSelective(@Param("record") ZheJiang02 record, @Param("example") ZheJiang02Example example);

    int updateByExample(@Param("record") ZheJiang02 record, @Param("example") ZheJiang02Example example);

    int updateByPrimaryKeySelective(ZheJiang02 record);

    int updateByPrimaryKey(ZheJiang02 record);

    List<ZheJiang02> selectAll();
}