package com.zhxfun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxfun.entity.SysUser;
import com.zhxfun.mapper.SysUserMapper;
import com.zhxfun.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public SysUser selectUserByuserId(String userId) {
		return sysUserMapper.selectByPrimaryKey(userId);
	}
}
