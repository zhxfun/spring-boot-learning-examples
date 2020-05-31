package com.zhxfun.mapper;

import com.zhxfun.entity.DeptEmp;
import com.zhxfun.entity.DeptEmpExample;
import com.zhxfun.entity.DeptEmpKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptEmpMapper {
    long countByExample(DeptEmpExample example);

    int deleteByExample(DeptEmpExample example);

    int deleteByPrimaryKey(DeptEmpKey key);

    int insert(DeptEmp record);

    int insertSelective(DeptEmp record);

    List<DeptEmp> selectByExample(DeptEmpExample example);

    DeptEmp selectByPrimaryKey(DeptEmpKey key);

    int updateByExampleSelective(@Param("record") DeptEmp record, @Param("example") DeptEmpExample example);

    int updateByExample(@Param("record") DeptEmp record, @Param("example") DeptEmpExample example);

    int updateByPrimaryKeySelective(DeptEmp record);

    int updateByPrimaryKey(DeptEmp record);
}