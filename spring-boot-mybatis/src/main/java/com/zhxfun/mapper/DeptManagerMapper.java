package com.zhxfun.mapper;

import com.zhxfun.entity.DeptManager;
import com.zhxfun.entity.DeptManagerExample;
import com.zhxfun.entity.DeptManagerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptManagerMapper {
    long countByExample(DeptManagerExample example);

    int deleteByExample(DeptManagerExample example);

    int deleteByPrimaryKey(DeptManagerKey key);

    int insert(DeptManager record);

    int insertSelective(DeptManager record);

    List<DeptManager> selectByExample(DeptManagerExample example);

    DeptManager selectByPrimaryKey(DeptManagerKey key);

    int updateByExampleSelective(@Param("record") DeptManager record, @Param("example") DeptManagerExample example);

    int updateByExample(@Param("record") DeptManager record, @Param("example") DeptManagerExample example);

    int updateByPrimaryKeySelective(DeptManager record);

    int updateByPrimaryKey(DeptManager record);
}