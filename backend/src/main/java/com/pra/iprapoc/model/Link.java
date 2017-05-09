package com.pra.iprapoc.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="ipa_links__c")
public class Link implements Serializable {
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

    @Column(name="css_class__c")
    private String cssClass;

    @Temporal(TemporalType.DATE)
    @Column(name="display_date__c")
    private Date displayDate;

    @Column(name="external_link__c")
    private Boolean externalLink;

    @Column(name="isdeleted")
    private Boolean isDeleted;

    @Column(name="link__c")
    private String link;

    @Column(name="link_type__c")
    private String linkType;

    private String name;

    @Column(name="no_of_sub_sub_menus__c")
    private Double noOfSubSubMenus;

    @Column(name="page__c")
    private String page;

    @Column(name="parent_link__c")
    private String parentLink;

    @Column(name="recordtypeid")
    private String recordTypeId;

    @Column(name="restricted_link__c")
    private Boolean restrictedLink;

    @Column(name="s_object_id_chatter_group_id__c")
    private String sObjectIdChatterGroupId;

    @Column(name="sfid")
    private String sfId;

    @Column(name="site_locations__c")
    private String siteLocations;

    @Column(name="systemmodstamp")
    private Timestamp systemModStamp;

    @Column(name="url__c")
    private String url;

    @Column(name="weight__c")
    private double weight;

    public Link() {
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

    public String getCssClass() {
        return this.cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public Date getDisplayDate() {
        return this.displayDate;
    }

    public void setDisplayDate(Date displayDate) {
        this.displayDate = displayDate;
    }

    public Boolean getExternalLink() {
        return this.externalLink;
    }

    public void setExternalLink(Boolean externalLink) {
        this.externalLink = externalLink;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNoOfSubSubMenus() {
        return this.noOfSubSubMenus;
    }

    public void setNoOfSubSubMenus(Double noOfSubSubMenus) {
        this.noOfSubSubMenus = noOfSubSubMenus;
    }

    public String getPage() {
        return this.page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getParentLink() {
        return this.parentLink;
    }

    public void setParentLink(String parentLink) {
        this.parentLink = parentLink;
    }

    public String getRecordTypeId() {
        return this.recordTypeId;
    }

    public void setRecordTypeId(String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }

    public Boolean getRestrictedLink() {
        return this.restrictedLink;
    }

    public void setRestrictedLink(Boolean restrictedLink) {
        this.restrictedLink = restrictedLink;
    }

    public String getSObjectIdChatterGroupId() {
        return this.sObjectIdChatterGroupId;
    }

    public void setSObjectIdChatterGroupId(String sObjectIdChatterGroupId) {
        this.sObjectIdChatterGroupId = sObjectIdChatterGroupId;
    }

    public String getSfId() {
        return this.sfId;
    }

    public void setSfId(String sfId) {
        this.sfId = sfId;
    }

    public String getSiteLocations() {
        return this.siteLocations;
    }

    public void setSiteLocations(String siteLocations) {
        this.siteLocations = siteLocations;
    }

    public Timestamp getSystemModStamp() {
        return this.systemModStamp;
    }

    public void setSystemModStamp(Timestamp systemModStamp) {
        this.systemModStamp = systemModStamp;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
