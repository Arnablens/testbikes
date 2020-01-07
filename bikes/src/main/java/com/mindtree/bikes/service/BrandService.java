package com.mindtree.bikes.service;

import org.springframework.stereotype.Service;

import com.mindtree.bikes.entity.Brand;
import com.mindtree.bikes.exception.ServiceException;

@Service
public interface BrandService {

	public void addBrand(Brand brand) throws ServiceException;

	public Object getBrands();

}
