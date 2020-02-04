package com.mindtree.bikes.service.dealerserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bikes.entity.Brand;
import com.mindtree.bikes.entity.Dealer;
import com.mindtree.bikes.repository.BrandRepository;
import com.mindtree.bikes.repository.DealerRepository;
import com.mindtree.bikes.service.DealerService;

@Service
public class DealerServiceimpl implements DealerService {
	@Autowired
	DealerRepository dealerRepository;
	@Autowired
	BrandRepository brandRepository;

	@Override
	public Object getDealers() {
		
		return dealerRepository.findAll();
	}

	@Override
	public void addDealer(int brandId, int dealerId) {
		Brand brand=brandRepository.getOne(brandId);
		Dealer dealer=dealerRepository.getOne(dealerId);
		dealer.setBrand(brand);
		brand.getDealers().add(dealer);
		brandRepository.saveAndFlush(brand);
		
		
	}

}
