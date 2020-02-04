package com.mindtree.bikes.service;

import org.springframework.stereotype.Service;

import com.mindtree.bikes.entity.Bike;
import com.mindtree.bikes.exception.ServiceException;

@Service
public interface BikeService {

	public void addBike(int brandId, Bike bike);

	public Object getBikes(String dealerName) throws ServiceException;

}
