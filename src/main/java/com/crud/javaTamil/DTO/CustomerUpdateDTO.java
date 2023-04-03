package com.crud.javaTamil.DTO;

public class CustomerUpdateDTO {
	private int customerID;
	private String customerName;
	private int mobile;
	private String customeAddress;
	
	
	public CustomerUpdateDTO(int customerID, String customerName, int mobile, String customeAddress) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.mobile = mobile;
		this.customeAddress = customeAddress;
	}
	public CustomerUpdateDTO() {
		super();
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
		return "CustomerDTO [customerID=" + customerID + ", customerName=" + customerName + ", mobile=" + mobile
				+ ", customeAddress=" + customeAddress + "]";
	}
}
