package com.sathya.entity;

public class Customer {

private String customerId;	
 private String customerName;
 private String city; 
	
 public Customer()
 {
	 
 }

public String getCustomerId() {
	return customerId;
}

public void setCustomerId(String customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + "]";
}
 
 
}
