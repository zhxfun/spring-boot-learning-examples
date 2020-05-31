package com.zhxfun.mapper;

import com.zhxfun.entity.Salarie;
import com.zhxfun.entity.SalarieExample;
import com.zhxfun.entity.SalarieKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalarieMapper {
    long countByExample(SalarieExample example);

    int deleteByExample(SalarieExample example);

    int deleteByPrimaryKey(SalarieKey key);

    int insert(Salarie record);

    int insertSelective(Salarie record);

    List<Salarie> selectByExample(SalarieExample example);

    Salarie selectByPrimaryKey(SalarieKey key);

    int updateByExampleSelective(@Param("record") Salarie record, @Param("example") SalarieExample example);

    int updateByExample(@Param("record") Salarie record, @Param("example") SalarieExample example);

    int updateByPrimaryKeySelective(Salarie record);

    int updateByPrimaryKey(Salarie record);
}