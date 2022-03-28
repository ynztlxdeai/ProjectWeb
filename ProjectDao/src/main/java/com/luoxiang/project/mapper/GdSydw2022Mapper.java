package com.luoxiang.project.mapper;

import com.luoxiang.project.po.GdSydw2022;
import com.luoxiang.project.po.GdSydw2022Example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GdSydw2022Mapper {
    int countByExample(GdSydw2022Example example);

    int deleteByExample(GdSydw2022Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(GdSydw2022 record);

    int insertSelective(GdSydw2022 record);

    List<GdSydw2022> selectByExample(GdSydw2022Example example);

    GdSydw2022 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") GdSydw2022 record,
                                 @Param("example") GdSydw2022Example example);

    int updateByExample(@Param("record") GdSydw2022 record,
                        @Param("example") GdSydw2022Example example);

    int updateByPrimaryKeySelective(GdSydw2022 record);

    int updateByPrimaryKey(GdSydw2022 record);

    List<GdSydw2022> selectAll();
}