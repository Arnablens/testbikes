package com.mindtree.bikes.service.brandserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bikes.entity.Brand;
import com.mindtree.bikes.exception.ServiceException;
import com.mindtree.bikes.repository.BrandRepository;
import com.mindtree.bikes.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	BrandRepository brandRepository;

	@Override
	public void addBrand(Brand brand) throws ServiceException {
		List<Brand> brands = brandRepository.findAll();
		int count=0;
		for (Brand brand2 : brands) {
			if(brand2.getName().compareToIgnoreCase(brand.getName())==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			brandRepository.save(brand);
		}
		else
		{
			throw new ServiceException("Brand Already Exists");
		}
		
	}

	@Override
	public Object getBrands() {
		
		return brandRepository.findAll();
	}

}
