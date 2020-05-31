package com.zhxfun;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zhxfun.service.DepartmentService;

@SpringBootTest
public class DepartmentTest {
	@Autowired
	private DepartmentService departmentService;

	@Test
	public void test1() {
		System.out.println(departmentService.selectDeptByDeptNo("d009"));
	}
}
