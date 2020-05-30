package com.zhxfun.service;

import com.zhxfun.entity.SysUser;

public interface SysUserService {
	/**
	 * 根据用户编号查询用户信息
	 * @param userId  用户Id
	 * @return
	 */
	SysUser selectUserByuserId(String userId);
}
