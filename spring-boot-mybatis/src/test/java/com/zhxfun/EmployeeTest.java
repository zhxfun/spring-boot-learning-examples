package com.zhxfun;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zhxfun.service.EmployeeService;

@SpringBootTest
public class EmployeeTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void test1() {

		System.out.println(employeeService.selectUserByEmpNo(10001));
	}

}
