package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TNSStudent {
	@Id
	private String UID;
	private String name;
	@Column(length = 15)
	private String brach;
	@Column(length = 10)
	private String batchNo;
	private float score;
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrach() {
		return brach;
	}
	public void setBrach(String brach) {
		this.brach = brach;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "TNSStudent [UID=" + UID + ", name=" + name + ", brach=" + brach + ", batchNo=" + batchNo + ", score="
				+ score + "]";
	}
		
}
