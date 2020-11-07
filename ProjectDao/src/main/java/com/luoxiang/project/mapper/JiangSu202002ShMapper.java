package com.luoxiang.project.mapper;

import com.luoxiang.project.po.JiangSu202002Sh;
import com.luoxiang.project.po.JiangSu202002ShExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiangSu202002ShMapper {
    int countByExample(JiangSu202002ShExample example);

    int deleteByExample(JiangSu202002ShExample example);

    int deleteByPrimaryKey(Integer jobIndex);

    int insert(JiangSu202002Sh record);

    int insertSelective(JiangSu202002Sh record);

    List<JiangSu202002Sh> selectByExample(JiangSu202002ShExample example);

    JiangSu202002Sh selectByPrimaryKey(Integer jobIndex);

    int updateByExampleSelective(@Param("record") JiangSu202002Sh record,
                                 @Param("example") JiangSu202002ShExample example);

    int updateByExample(@Param("record") JiangSu202002Sh record,
                        @Param("example") JiangSu202002ShExample example);

    int updateByPrimaryKeySelective(JiangSu202002Sh record);

    int updateByPrimaryKey(JiangSu202002Sh record);

    List<JiangSu202002Sh> selectAll();
}