package com.luoxiang.project.mapper;

import com.luoxiang.project.po.ZheJiang2020;
import com.luoxiang.project.po.ZheJiang2020Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZheJiang2020Mapper {
    int countByExample(ZheJiang2020Example example);

    int deleteByExample(ZheJiang2020Example example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(ZheJiang2020 record);

    int insertSelective(ZheJiang2020 record);

    List<ZheJiang2020> selectByExample(ZheJiang2020Example example);

    ZheJiang2020 selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") ZheJiang2020 record,
                                 @Param("example") ZheJiang2020Example example);

    int updateByExample(@Param("record") ZheJiang2020 record,
                        @Param("example") ZheJiang2020Example example);

    int updateByPrimaryKeySelective(ZheJiang2020 record);

    int updateByPrimaryKey(ZheJiang2020 record);

    List<ZheJiang2020> selectAll();
}