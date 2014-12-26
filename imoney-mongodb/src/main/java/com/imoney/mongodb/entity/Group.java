package com.imoney.mongodb.entity;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.bson.types.ObjectId;
/**
 * 对好友分组，并发布权限
 * 
 * @author v11
 */
public class Group extends AbstractDocument{
	private ObjectId owner;
	private List<ObjectId> uid;
	private String name;
	private Date createAt;
	public ObjectId getOwner() {
		return owner;
	}
	public void setOwner(ObjectId owner) {
		this.owner = owner;
	}
	public List<ObjectId> getUid() {
		return uid;
	}
	public void setUid(List<ObjectId> uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ToStringBuilder.reflectionToString(this);
	}
}
