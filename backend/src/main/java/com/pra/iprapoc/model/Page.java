package com.pra.iprapoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="ipa_page__c")
public class Page implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    @Column(name="_hc_err")
    private String hcErr;

    @Column(name="_hc_lastop")
    private String hcLastop;

    @Column(name="category__c")
    private String category;

    @Column(name="createddate")
    private Timestamp createdDate;

    @Column(name="isdeleted")
    private Boolean isDeleted;

    @Column(name="master_landing_page__c")
    private Boolean masterLandingPage;

    private String name;

    @Column(name="parent_page__c")
    private String parentPage;

    @Column(name="published__c")
    private Boolean published;

    @Column(name="recordtypeid")
    private String recordTypeId;

    @Column(name="sfid")
    private String sfId;

    @Column(name="systemmodstamp")
    private Timestamp systemModStamp;

    public Page() {
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

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public Boolean getMasterLandingPage() {
        return this.masterLandingPage;
    }

    public void setMasterLandingPage(Boolean masterLandingPage) {
        this.masterLandingPage = masterLandingPage;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentPage() {
        return this.parentPage;
    }

    public void setParentPage(String parentPage) {
        this.parentPage = parentPage;
    }

    public Boolean getPublished() {
        return this.published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public String getRecordTypeId() {
        return this.recordTypeId;
    }

    public void setRecordTypeId(String recordTypeId) {
        this.recordTypeId = recordTypeId;
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