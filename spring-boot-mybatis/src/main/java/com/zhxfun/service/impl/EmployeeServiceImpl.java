package com.zhxfun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxfun.entity.Employee;
import com.zhxfun.mapper.EmployeeMapper;
import com.zhxfun.service.EmployeeService;

@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public Employee selectUserByEmpNo(int empNo) {
		return employeeMapper.selectByPrimaryKey(empNo);
	}

}
