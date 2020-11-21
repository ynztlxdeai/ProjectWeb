package com.luoxiang.project.mapper;

import com.luoxiang.project.po.ShanDong202002Sh;
import com.luoxiang.project.po.ShanDong202002ShExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShanDong202002ShMapper {
    int countByExample(ShanDong202002ShExample example);

    int deleteByExample(ShanDong202002ShExample example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(ShanDong202002Sh record);

    int insertSelective(ShanDong202002Sh record);

    List<ShanDong202002Sh> selectByExample(ShanDong202002ShExample example);

    List<ShanDong202002Sh> selectAll();

    ShanDong202002Sh selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") ShanDong202002Sh record,
                                 @Param("example") ShanDong202002ShExample example);

    int updateByExample(@Param("record") ShanDong202002Sh record,
                        @Param("example") ShanDong202002ShExample example);

    int updateByPrimaryKeySelective(ShanDong202002Sh record);

    int updateByPrimaryKey(ShanDong202002Sh record);
}