package com.crud.javaTamil.DTO;

public class CustomerSaveDTO {
	
	private String customerName;
	private int mobile;
	private String customeAddress;
	
	
	public CustomerSaveDTO( String customerName, int mobile, String customeAddress) {
		super();
		
		this.customerName = customerName;
		this.mobile = mobile;
		this.customeAddress = customeAddress;
	}
	public CustomerSaveDTO() {
		super();
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
		return "CustomerDTO [ customerName=" + customerName + ", mobile=" + mobile
				+ ", customeAddress=" + customeAddress + "]";
	}
}
