package com.imoney.mongodb.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.bson.types.ObjectId;

/**
 * 权限<p/>
 * 目前包括
 * <ol>
 * <li> 是否可以查看对方账单</li>
 * </ol>
 * 
 * @author v11
 */
public class Permission extends AbstractDocument{
	private ObjectId from;
	private ObjectId to;
	private Integer opt;
	public ObjectId getFrom() {
		return from;
	}
	public void setFrom(ObjectId from) {
		this.from = from;
	}
	public ObjectId getTo() {
		return to;
	}
	public void setTo(ObjectId to) {
		this.to = to;
	}
	public Integer getOpt() {
		return opt;
	}
	public void setOpt(Integer opt) {
		this.opt = opt;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ToStringBuilder.reflectionToString(this);
	}
}
