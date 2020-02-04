package com.mindtree.bikes.service;

import org.springframework.stereotype.Service;

@Service
public interface DealerService {

	public Object getDealers();

	public void addDealer(int brandId, int dealerId);

}
