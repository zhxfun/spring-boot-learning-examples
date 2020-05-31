package com.zhxfun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxfun.entity.Department;
import com.zhxfun.mapper.DepartmentMapper;
import com.zhxfun.service.DepartmentService;

@Service(value = "departmentService")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public Department selectDeptByDeptNo(String deptNo) {
		return departmentMapper.selectByPrimaryKey(deptNo).get();
	}

}
