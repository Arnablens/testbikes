package com.mindtree.bikes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bikeId;
	private String bikeName;
	private int price;
	public Bike() {
		super();
	}
	public Bike(int bikeId, String bikeName, int price) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.price = price;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bikeName=" + bikeName + ", price=" + price + "]";
	}
	
		

}
