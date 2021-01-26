package com.nh.common.core.domain.entity;

import java.util.Date;

public class SysUnion {
    private Long unionId;

    private Long parentUnionId;

    private String ancestors;

    private String unionName;

    private String unionType;

    private String unionChairman;

    private String unionContactPerson;

    private String unionContactPhone;

    private String unionPhone;

    private String unionEmail;

    private String unionLevel;

    private Integer orderNum;

    private String status;

    private String delFlag;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    public SysUnion(Long unionId, Long parentUnionId, String ancestors, String unionName, String unionType, String unionChairman, String unionContactPerson, String unionContactPhone, String unionPhone, String unionEmail, String unionLevel, Integer orderNum, String status, String delFlag, String createBy, Date createTime, String updateBy, Date updateTime) {
        this.unionId = unionId;
        this.parentUnionId = parentUnionId;
        this.ancestors = ancestors;
        this.unionName = unionName;
        this.unionType = unionType;
        this.unionChairman = unionChairman;
        this.unionContactPerson = unionContactPerson;
        this.unionContactPhone = unionContactPhone;
        this.unionPhone = unionPhone;
        this.unionEmail = unionEmail;
        this.unionLevel = unionLevel;
        this.orderNum = orderNum;
        this.status = status;
        this.delFlag = delFlag;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public SysUnion() {
        super();
    }

    public Long getUnionId() {
        return unionId;
    }

    public void setUnionId(Long unionId) {
        this.unionId = unionId;
    }

    public Long getParentUnionId() {
        return parentUnionId;
    }

    public void setParentUnionId(Long parentUnionId) {
        this.parentUnionId = parentUnionId;
    }

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors == null ? null : ancestors.trim();
    }

    public String getUnionName() {
        return unionName;
    }

    public void setUnionName(String unionName) {
        this.unionName = unionName == null ? null : unionName.trim();
    }

    public String getUnionType() {
        return unionType;
    }

    public void setUnionType(String unionType) {
        this.unionType = unionType == null ? null : unionType.trim();
    }

    public String getUnionChairman() {
        return unionChairman;
    }

    public void setUnionChairman(String unionChairman) {
        this.unionChairman = unionChairman == null ? null : unionChairman.trim();
    }

    public String getUnionContactPerson() {
        return unionContactPerson;
    }

    public void setUnionContactPerson(String unionContactPerson) {
        this.unionContactPerson = unionContactPerson == null ? null : unionContactPerson.trim();
    }

    public String getUnionContactPhone() {
        return unionContactPhone;
    }

    public void setUnionContactPhone(String unionContactPhone) {
        this.unionContactPhone = unionContactPhone == null ? null : unionContactPhone.trim();
    }

    public String getUnionPhone() {
        return unionPhone;
    }

    public void setUnionPhone(String unionPhone) {
        this.unionPhone = unionPhone == null ? null : unionPhone.trim();
    }

    public String getUnionEmail() {
        return unionEmail;
    }

    public void setUnionEmail(String unionEmail) {
        this.unionEmail = unionEmail == null ? null : unionEmail.trim();
    }

    public String getUnionLevel() {
        return unionLevel;
    }

    public void setUnionLevel(String unionLevel) {
        this.unionLevel = unionLevel == null ? null : unionLevel.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}