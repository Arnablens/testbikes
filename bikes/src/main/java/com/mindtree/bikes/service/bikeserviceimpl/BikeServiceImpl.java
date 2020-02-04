package com.mindtree.bikes.service.bikeserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bikes.entity.Bike;
import com.mindtree.bikes.entity.Brand;
import com.mindtree.bikes.entity.Dealer;
import com.mindtree.bikes.exception.ServiceException;
import com.mindtree.bikes.repository.BikeRepository;
import com.mindtree.bikes.repository.BrandRepository;
import com.mindtree.bikes.repository.DealerRepository;
import com.mindtree.bikes.service.BikeService;

@Service
public class BikeServiceImpl implements BikeService {

	@Autowired
	BikeRepository bikeRepository;
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	DealerRepository dealerRepository;
	
	@Override
	public void addBike(int brandId, Bike bike) {
		Brand brand=brandRepository.getOne(brandId);
		brand.getBikes().add(bike);
		int investment=brand.getInvestment()+bike.getPrice();
		brand.setInvestment(investment);
		brandRepository.saveAndFlush(brand);	
	}
	
	@Override
	public Object getBikes(String dealerName) throws ServiceException {
		List<Dealer> dealers = dealerRepository.findAll();
		Dealer dealer = dealers.stream().filter(i -> i.getDealerName().compareToIgnoreCase(dealerName)==0).findAny().orElseThrow(() -> new ServiceException("Dealer is not found !"));
		return dealer.getBrand().getBikes();	
	}

}
