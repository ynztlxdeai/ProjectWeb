package com.luoxiang.project.mapper;

import com.luoxiang.project.po.SiChuan202101;
import com.luoxiang.project.po.SiChuan202101Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiChuan202101Mapper {
    int countByExample(SiChuan202101Example example);

    int deleteByExample(SiChuan202101Example example);

    int deleteByPrimaryKey(Integer jobindex);

    int insert(SiChuan202101 record);

    int insertSelective(SiChuan202101 record);

    List<SiChuan202101> selectByExample(SiChuan202101Example example);

    SiChuan202101 selectByPrimaryKey(Integer jobindex);

    int updateByExampleSelective(@Param("record") SiChuan202101 record,
                                 @Param("example") SiChuan202101Example example);

    int updateByExample(@Param("record") SiChuan202101 record,
                        @Param("example") SiChuan202101Example example);

    int updateByPrimaryKeySelective(SiChuan202101 record);

    int updateByPrimaryKey(SiChuan202101 record);

    List<SiChuan202101> selectAll();
}