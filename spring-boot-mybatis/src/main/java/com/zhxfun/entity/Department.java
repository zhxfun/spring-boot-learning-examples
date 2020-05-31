package com.zhxfun.entity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Department implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deptNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deptName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeptNo() {
        return deptNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo == null ? null : deptNo.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeptName() {
        return deptName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Department other = (Department) that;
        return (this.getDeptNo() == null ? other.getDeptNo() == null : this.getDeptNo().equals(other.getDeptNo()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()));
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeptNo() == null) ? 0 : getDeptNo().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        return result;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptNo=").append(deptNo);
        sb.append(", deptName=").append(deptName);
        sb.append("]");
        return sb.toString();
    }
}