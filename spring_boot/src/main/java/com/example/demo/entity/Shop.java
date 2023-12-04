package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shop {
	@Id
	private int shopId;
	private String shopCategory;
	private String shopEmployeeName;
	private String shopName;
	private String customerName;
	private String shopStatus;
	private String shopOwnerName;
	private String leaseStatus;
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopEmployeeName() {
		return shopEmployeeName;
	}
	public void setShopEmployeeName(String shopEmployeeName) {
		this.shopEmployeeName = shopEmployeeName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getShopOwnerName() {
		return shopOwnerName;
	}
	public void setShopOwnerName(String shopOwnerName) {
		this.shopOwnerName = shopOwnerName;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopEmployeeName=" + shopEmployeeName
				+ ", shopName=" + shopName + ", customerName=" + customerName + ", shopStatus=" + shopStatus
				+ ", shopOwnerName=" + shopOwnerName + ", leaseStatus=" + leaseStatus + "]";
	}
	
	
}
