package com.luoxiang.project.mapper;

import com.luoxiang.project.po.SiChuan202002;
import com.luoxiang.project.po.SiChuan202002Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiChuan202002Mapper {
    int countByExample(SiChuan202002Example example);

    int deleteByExample(SiChuan202002Example example);

    int deleteByPrimaryKey(Integer jobindex);

    int insert(SiChuan202002 record);

    int insertSelective(SiChuan202002 record);

    List<SiChuan202002> selectByExample(SiChuan202002Example example);

    SiChuan202002 selectByPrimaryKey(Integer jobindex);

    int updateByExampleSelective(@Param("record") SiChuan202002 record,
                                 @Param("example") SiChuan202002Example example);

    int updateByExample(@Param("record") SiChuan202002 record,
                        @Param("example") SiChuan202002Example example);

    int updateByPrimaryKeySelective(SiChuan202002 record);

    int updateByPrimaryKey(SiChuan202002 record);
}