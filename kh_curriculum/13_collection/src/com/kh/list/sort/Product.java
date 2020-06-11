package com.kh.list.sort;

public class Product {
	private String name;
	private int price;
	private double discountrate;
	
	public Product() {}

	public Product(String name, int price, double discountrate) {
		this.name = name;
		this.price = price;
		this.discountrate = discountrate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountrate() {
		return discountrate;
	}

	public void setDiscountrate(double discountrate) {
		this.discountrate = discountrate;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price + ", discountrate=" + discountrate;
	}
}
