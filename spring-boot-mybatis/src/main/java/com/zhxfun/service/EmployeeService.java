package com.zhxfun.service;

import com.zhxfun.entity.Employee;

/**
 * 员工信息
 * @author zhxfun
 *
 */
public interface EmployeeService {
	/**
	 * 根据员工编号查询员工信息
	 * @param empNo
	 * @return
	 */
	Employee selectUserByEmpNo(int empNo);
}
