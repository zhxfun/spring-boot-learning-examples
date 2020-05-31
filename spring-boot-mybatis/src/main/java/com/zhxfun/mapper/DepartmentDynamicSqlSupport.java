package com.zhxfun.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DepartmentDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Department department = new Department();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deptNo = department.deptNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deptName = department.deptName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Department extends SqlTable {
        public final SqlColumn<String> deptNo = column("dept_no", JDBCType.CHAR);

        public final SqlColumn<String> deptName = column("dept_name", JDBCType.VARCHAR);

        public Department() {
            super("departments");
        }
    }
}