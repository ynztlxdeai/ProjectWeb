package com.luoxiang.project.mapper;

import com.luoxiang.project.po.Baomingqingkuang;
import com.luoxiang.project.po.BaomingqingkuangExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaomingqingkuangMapper {
    int countByExample(BaomingqingkuangExample example);

    int deleteByExample(BaomingqingkuangExample example);

    int deleteByPrimaryKey(Integer jobId);

    int insert(Baomingqingkuang record);

    int insertSelective(Baomingqingkuang record);

    List<Baomingqingkuang> selectByExample(BaomingqingkuangExample example);

    Baomingqingkuang selectByPrimaryKey(Integer jobId);

    int updateByExampleSelective(@Param("record") Baomingqingkuang record,
                                 @Param("example") BaomingqingkuangExample example);

    int updateByExample(@Param("record") Baomingqingkuang record,
                        @Param("example") BaomingqingkuangExample example);

    int updateByPrimaryKeySelective(Baomingqingkuang record);

    int updateByPrimaryKey(Baomingqingkuang record);
}