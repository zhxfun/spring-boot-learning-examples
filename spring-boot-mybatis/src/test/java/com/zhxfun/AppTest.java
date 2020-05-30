package com.zhxfun;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zhxfun.service.SysUserService;
@SpringBootTest
public class AppTest {

	@Autowired
	private SysUserService sysUserService;
	
	@Test
    public void test1() {
		
		System.out.println(sysUserService.selectUserByuserId("1001"));
    }
	
}
