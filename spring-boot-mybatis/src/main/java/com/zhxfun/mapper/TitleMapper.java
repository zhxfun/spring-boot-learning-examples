package com.zhxfun.mapper;

import com.zhxfun.entity.Title;
import com.zhxfun.entity.TitleExample;
import com.zhxfun.entity.TitleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TitleMapper {
    long countByExample(TitleExample example);

    int deleteByExample(TitleExample example);

    int deleteByPrimaryKey(TitleKey key);

    int insert(Title record);

    int insertSelective(Title record);

    List<Title> selectByExample(TitleExample example);

    Title selectByPrimaryKey(TitleKey key);

    int updateByExampleSelective(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByExample(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);
}