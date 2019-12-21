package com.luoxiang.project.mapper;

import com.luoxiang.project.po.ZheJiang02;
import com.luoxiang.project.po.ZheJiang02Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZheJiang02Mapper {
    int countByExample(ZheJiang02Example example);

    int deleteByExample(ZheJiang02Example example);

    int insert(ZheJiang02 record);

    int insertSelective(ZheJiang02 record);

    List<ZheJiang02> selectByExample(ZheJiang02Example example);

    int updateByExampleSelective(@Param("record") ZheJiang02 record, @Param("example") ZheJiang02Example example);

    int updateByExample(@Param("record") ZheJiang02 record, @Param("example") ZheJiang02Example example);
}