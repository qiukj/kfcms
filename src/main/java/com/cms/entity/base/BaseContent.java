package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseContent<M extends BaseContent<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setCreateDate(java.util.Date createDate) {
		set("createDate", createDate);
		return (M)this;
	}
	
	public java.util.Date getCreateDate() {
		return get("createDate");
	}

	public M setModifyDate(java.util.Date modifyDate) {
		set("modifyDate", modifyDate);
		return (M)this;
	}
	
	public java.util.Date getModifyDate() {
		return get("modifyDate");
	}

	public M setHits(java.lang.Long hits) {
		set("hits", hits);
		return (M)this;
	}
	
	public java.lang.Long getHits() {
		return getLong("hits");
	}

	public M setIsEnabled(java.lang.Boolean isEnabled) {
		set("isEnabled", isEnabled);
		return (M)this;
	}
	
	public java.lang.Boolean getIsEnabled() {
		return get("isEnabled");
	}

	public M setDescription(java.lang.String description) {
		set("description", description);
		return (M)this;
	}
	
	public java.lang.String getDescription() {
		return getStr("description");
	}

	public M setKeywords(java.lang.String keywords) {
		set("keywords", keywords);
		return (M)this;
	}
	
	public java.lang.String getKeywords() {
		return getStr("keywords");
	}

	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public M setImage(java.lang.String image) {
		set("image", image);
		return (M)this;
	}
	
	public java.lang.String getImage() {
		return getStr("image");
	}

	public M setIntroduction(java.lang.String introduction) {
		set("introduction", introduction);
		return (M)this;
	}
	
	public java.lang.String getIntroduction() {
		return getStr("introduction");
	}

	public M setCategoryId(java.lang.Long categoryId) {
		set("categoryId", categoryId);
		return (M)this;
	}
	
	public java.lang.Long getCategoryId() {
		return getLong("categoryId");
	}

	public M setContentFieldValue(java.lang.String contentFieldValue) {
		set("contentFieldValue", contentFieldValue);
		return (M)this;
	}
	
	public java.lang.String getContentFieldValue() {
		return getStr("contentFieldValue");
	}

	public M setTagValue(java.lang.String tagValue) {
		set("tagValue", tagValue);
		return (M)this;
	}
	
	public java.lang.String getTagValue() {
		return getStr("tagValue");
	}

}
