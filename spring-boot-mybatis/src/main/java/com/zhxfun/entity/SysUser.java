package com.zhxfun.entity;

import java.io.Serializable;

public class SysUser implements Serializable {
    private String userId;

    private String orgId;

    private String userName;

    private String pwd;

    private Integer errLgnCnt;

    private Integer rsetPswMark;

    private String idtType;

    private String idtNo;

    private String empId;

    private String userType;

    private String loginIp;

    private String loginDate;

    private String loginTime;

    private String remark;

    private String addr;

    private String cardName;

    private String email;

    private String position;

    private String phone;

    private String mobile;

    private String sex;

    private Integer stat;

    private String closeDate;

    private String headImg;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Integer getErrLgnCnt() {
        return errLgnCnt;
    }

    public void setErrLgnCnt(Integer errLgnCnt) {
        this.errLgnCnt = errLgnCnt;
    }

    public Integer getRsetPswMark() {
        return rsetPswMark;
    }

    public void setRsetPswMark(Integer rsetPswMark) {
        this.rsetPswMark = rsetPswMark;
    }

    public String getIdtType() {
        return idtType;
    }

    public void setIdtType(String idtType) {
        this.idtType = idtType == null ? null : idtType.trim();
    }

    public String getIdtNo() {
        return idtNo;
    }

    public void setIdtNo(String idtNo) {
        this.idtNo = idtNo == null ? null : idtNo.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate == null ? null : loginDate.trim();
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime == null ? null : loginTime.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate == null ? null : closeDate.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
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
        SysUser other = (SysUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getErrLgnCnt() == null ? other.getErrLgnCnt() == null : this.getErrLgnCnt().equals(other.getErrLgnCnt()))
            && (this.getRsetPswMark() == null ? other.getRsetPswMark() == null : this.getRsetPswMark().equals(other.getRsetPswMark()))
            && (this.getIdtType() == null ? other.getIdtType() == null : this.getIdtType().equals(other.getIdtType()))
            && (this.getIdtNo() == null ? other.getIdtNo() == null : this.getIdtNo().equals(other.getIdtNo()))
            && (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getLoginDate() == null ? other.getLoginDate() == null : this.getLoginDate().equals(other.getLoginDate()))
            && (this.getLoginTime() == null ? other.getLoginTime() == null : this.getLoginTime().equals(other.getLoginTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()))
            && (this.getCardName() == null ? other.getCardName() == null : this.getCardName().equals(other.getCardName()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getStat() == null ? other.getStat() == null : this.getStat().equals(other.getStat()))
            && (this.getCloseDate() == null ? other.getCloseDate() == null : this.getCloseDate().equals(other.getCloseDate()))
            && (this.getHeadImg() == null ? other.getHeadImg() == null : this.getHeadImg().equals(other.getHeadImg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getErrLgnCnt() == null) ? 0 : getErrLgnCnt().hashCode());
        result = prime * result + ((getRsetPswMark() == null) ? 0 : getRsetPswMark().hashCode());
        result = prime * result + ((getIdtType() == null) ? 0 : getIdtType().hashCode());
        result = prime * result + ((getIdtNo() == null) ? 0 : getIdtNo().hashCode());
        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getLoginDate() == null) ? 0 : getLoginDate().hashCode());
        result = prime * result + ((getLoginTime() == null) ? 0 : getLoginTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
        result = prime * result + ((getCardName() == null) ? 0 : getCardName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getStat() == null) ? 0 : getStat().hashCode());
        result = prime * result + ((getCloseDate() == null) ? 0 : getCloseDate().hashCode());
        result = prime * result + ((getHeadImg() == null) ? 0 : getHeadImg().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", orgId=").append(orgId);
        sb.append(", userName=").append(userName);
        sb.append(", pwd=").append(pwd);
        sb.append(", errLgnCnt=").append(errLgnCnt);
        sb.append(", rsetPswMark=").append(rsetPswMark);
        sb.append(", idtType=").append(idtType);
        sb.append(", idtNo=").append(idtNo);
        sb.append(", empId=").append(empId);
        sb.append(", userType=").append(userType);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", loginDate=").append(loginDate);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", remark=").append(remark);
        sb.append(", addr=").append(addr);
        sb.append(", cardName=").append(cardName);
        sb.append(", email=").append(email);
        sb.append(", position=").append(position);
        sb.append(", phone=").append(phone);
        sb.append(", mobile=").append(mobile);
        sb.append(", sex=").append(sex);
        sb.append(", stat=").append(stat);
        sb.append(", closeDate=").append(closeDate);
        sb.append(", headImg=").append(headImg);
        sb.append("]");
        return sb.toString();
    }
}