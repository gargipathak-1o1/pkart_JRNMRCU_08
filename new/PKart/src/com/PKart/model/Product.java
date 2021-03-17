package com.PKart.model;

import java.util.List;

public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	private String mfDate;
	private String exDate;
	public Product() {}
	public Product(int id, String name, double price, int quantity, String mfDate, String exDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.mfDate = mfDate;
		this.exDate = exDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getMfDate() {
		return mfDate;
	}
	public void setMfDate(String mfDate) {
		this.mfDate = mfDate;
	}
	public String getExDate() {
		return exDate;
	}
	public void setExDate(String exDate) {
		this.exDate = exDate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", mfDate="
				+ mfDate + ", exDate=" + exDate + "]";
	}
public int setGet(int id) {
	this.id=id;
	return this.id;
}
}
