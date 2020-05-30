package com.zhxfun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhxfun.entity.SysUser;
import com.zhxfun.service.SysUserService;

@RestController
@RequestMapping("/sys")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	@RequestMapping("/user/{userId}")
	public SysUser String(@PathVariable(name = "userId") String userId) {
		return sysUserService.selectUserByuserId(userId);
	}

}
