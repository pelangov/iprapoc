package com.pra.iprapoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="ipa_category__c")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    @Column(name="_hc_err")
    private String hcErr;

    @Column(name="_hc_lastop")
    private String hcLastop;

    @Column(name="active__c")
    private Boolean active;

    @Column(name="category_key__c")
    private String categoryKey;

    @Column(name="createddate")
    private Timestamp createdDate;

    @Column(name="isdeleted")
    private Boolean isDeleted;

    private String name;

    @Column(name="parent_category__c")
    private String parentCategory;

    @Column(name="private_category__c")
    private Boolean privateCategory;

    @Column(name="sfid")
    private String sfId;

    @Column(name="systemmodstamp")
    private Timestamp systemModStamp;

    public Category() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHcErr() {
        return this.hcErr;
    }

    public void setHcErr(String hcErr) {
        this.hcErr = hcErr;
    }

    public String getHcLastop() {
        return this.hcLastop;
    }

    public void setHcLastop(String hcLastop) {
        this.hcLastop = hcLastop;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCategoryKey() {
        return this.categoryKey;
    }

    public void setCategoryKey(String categoryKey) {
        this.categoryKey = categoryKey;
    }

    public Timestamp getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentCategory() {
        return this.parentCategory;
    }

    public void setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Boolean getPrivateCategory() {
        return this.privateCategory;
    }

    public void setPrivateCategory(Boolean privateCategory) {
        this.privateCategory = privateCategory;
    }

    public String getSfId() {
        return this.sfId;
    }

    public void setSfId(String sfId) {
        this.sfId = sfId;
    }

    public Timestamp getSystemModStamp() {
        return this.systemModStamp;
    }

    public void setSystemModStamp(Timestamp systemModStamp) {
        this.systemModStamp = systemModStamp;
    }

}
