package com.zhxfun.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Salarie extends SalarieKey implements Serializable {
    private Integer salary;

    private LocalDate toDate;

    private static final long serialVersionUID = 1L;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    @Override
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
        Salarie other = (Salarie) that;
        if (!super.equals(other)) {
            return false;
        }
        return (this.getEmpNo() == null ? other.getEmpNo() == null : this.getEmpNo().equals(other.getEmpNo()))
            && (this.getFromDate() == null ? other.getFromDate() == null : this.getFromDate().equals(other.getFromDate()))
            && (this.getSalary() == null ? other.getSalary() == null : this.getSalary().equals(other.getSalary()))
            && (this.getToDate() == null ? other.getToDate() == null : this.getToDate().equals(other.getToDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + super.hashCode();
        result = prime * result + ((getEmpNo() == null) ? 0 : getEmpNo().hashCode());
        result = prime * result + ((getFromDate() == null) ? 0 : getFromDate().hashCode());
        result = prime * result + ((getSalary() == null) ? 0 : getSalary().hashCode());
        result = prime * result + ((getToDate() == null) ? 0 : getToDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", salary=").append(salary);
        sb.append(", toDate=").append(toDate);
        sb.append("]");
        sb.append(", from super class ");
        sb.append(super.toString());
        return sb.toString();
    }
}