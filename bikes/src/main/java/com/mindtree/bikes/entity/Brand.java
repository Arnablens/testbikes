package com.mindtree.bikes.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Brand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int brandId;
	private String name;
	@Column (columnDefinition = "double default 0")
	private int investment;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy="brand")
	private List<Dealer> dealers;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "brandId")
	private List<Bike> bikes;

	public Brand() {
		super();
	}

	public Brand(int brandId, String name, int investment, List<Dealer> dealers, List<Bike> bikes) {
		super();
		this.brandId = brandId;
		this.name = name;
		this.investment = investment;
		this.dealers = dealers;
		this.bikes = bikes;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInvestment() {
		return investment;
	}

	public void setInvestment(int investment) {
		this.investment = investment;
	}

	public List<Dealer> getDealers() {
		return dealers;
	}

	public void setDealers(List<Dealer> dealers) {
		this.dealers = dealers;
	}

	public List<Bike> getBikes() {
		return bikes;
	}

	public void setBikes(List<Bike> bikes) {
		this.bikes = bikes;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", name=" + name + ", investment=" + investment + ", dealers=" + dealers
				+ ", bikes=" + bikes + "]";
	}

		
}
