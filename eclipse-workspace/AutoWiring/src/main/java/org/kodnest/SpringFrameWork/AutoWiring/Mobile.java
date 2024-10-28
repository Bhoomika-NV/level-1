package org.kodnest.SpringFrameWork.AutoWiring;

public class Mobile {
	String brand;
	int Ram;
	int price;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String brand, int ram, int price) {
		super();
		this.brand = brand;
		Ram = ram;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", Ram=" + Ram + ", price=" + price + "]";
	}


}
