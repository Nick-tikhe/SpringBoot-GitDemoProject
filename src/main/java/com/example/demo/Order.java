package com.example.demo;

public class Order {
private String username;
private double amount;
private String productName;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Order(String username, double amount, String productName) {
	super();
	this.username = username;
	this.amount = amount;
	this.productName = productName;
}
public Order() {
	super();
}
@Override
public String toString() {
	return "Order [username=" + username + ", amount=" + amount + ", productName=" + productName + "]";
}



}
