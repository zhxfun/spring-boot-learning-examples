package com.zhxfun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhxfun.entity.Employee;
import com.zhxfun.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employee/{userId}")
	public Employee String(@PathVariable(name = "empNo") int empNo) {
		return employeeService.selectUserByEmpNo(empNo);
	}

}
