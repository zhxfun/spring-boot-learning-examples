package com.zhxfun.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Title extends TitleKey implements Serializable {
    private LocalDate toDate;

    private static final long serialVersionUID = 1L;

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
        Title other = (Title) that;
        if (!super.equals(other)) {
            return false;
        }
        return (this.getEmpNo() == null ? other.getEmpNo() == null : this.getEmpNo().equals(other.getEmpNo()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getFromDate() == null ? other.getFromDate() == null : this.getFromDate().equals(other.getFromDate()))
            && (this.getToDate() == null ? other.getToDate() == null : this.getToDate().equals(other.getToDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + super.hashCode();
        result = prime * result + ((getEmpNo() == null) ? 0 : getEmpNo().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getFromDate() == null) ? 0 : getFromDate().hashCode());
        result = prime * result + ((getToDate() == null) ? 0 : getToDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", toDate=").append(toDate);
        sb.append("]");
        sb.append(", from super class ");
        sb.append(super.toString());
        return sb.toString();
    }
}