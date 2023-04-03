package com.crud.javaTamil.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@Column(name="customer_id", length=50)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerID;
	@Column(name="customer_name", length=50)
	private String customerName;
	@Column(name="customer_mobile", length=60)
	private int mobile;
	@Column(name="customer_address", length=12)
	private String customeAddress;
	public Customer(int customerID, String customerName, int mobile, String customeAddress) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.mobile = mobile;
		this.customeAddress = customeAddress;
	}
	
	
	public Customer() {
		super();
	}


	public Customer(String customerName, int mobile, String customeAddress) {
		super();
		this.customerName = customerName;
		this.mobile = mobile;
		this.customeAddress = customeAddress;
	}


	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getCustomeAddress() {
		return customeAddress;
	}
	public void setCustomeAddress(String customeAddress) {
		this.customeAddress = customeAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", mobile=" + mobile
				+ ", customeAddress=" + customeAddress + "]";
	}
	
	
}
