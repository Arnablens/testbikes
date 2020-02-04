package com.mindtree.bikes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.bikes.entity.Bike;
import com.mindtree.bikes.entity.Brand;
import com.mindtree.bikes.exception.ServiceException;
import com.mindtree.bikes.service.BikeService;
import com.mindtree.bikes.service.BrandService;
import com.mindtree.bikes.service.DealerService;

@Controller
public class BikesController {
	
	@Autowired
	BrandService brandService;
	
	@Autowired
	BikeService bikeService;
	
	@Autowired
	DealerService dealerService;
	
	@RequestMapping("/")
	public String menu()
	{
		return "menu";
	}
	
	@RequestMapping("/addBrand")
	public String addBrand()
	{
		return "addBrand";
	}
	@PostMapping("/addBrandToDb")
	public String addColleges(Brand brand) throws ServiceException
	{   
		brandService.addBrand(brand);
		return "success";
	}
	
	@RequestMapping("/assignBikeToBrand")
	public String addBranch(Model model)
	{
		model.addAttribute("brands", brandService.getBrands());
		return "addBike";
	}
	@PostMapping("/addBikesToDb")
	public String addBranches(@RequestParam("brandId") int brandId ,Bike bike) 
	{ 
		bikeService.addBike(brandId,bike);
		return "success";
	}
	
	@RequestMapping("/investments")
	public String viewInvestments(Model model)
	{
		model.addAttribute("brands", brandService.getBrands());
		return "investmentspage";
	}
	
	@RequestMapping("/assignDealerToBrand")
	public String addDealer(Model model)
	{
		model.addAttribute("brands", brandService.getBrands());
		model.addAttribute("dealers", dealerService.getDealers());
		return "assignDealerToBrand";
	}
	@PostMapping("/addDealerToBrand")
	public String assignDealer(@RequestParam("brandId") int brandId ,@RequestParam("dealerId") int dealerId) 
	{ 
		dealerService.addDealer(brandId,dealerId);
		return "success";
	}
	
	@RequestMapping("/display")
	public String display()
	{
		return "displaybikes";
	}
	@RequestMapping("/displayBikes")
	public String displayBikes(@RequestParam("dealerName") String dealerName, Model model) throws ServiceException
	{
		model.addAttribute("bikes", bikeService.getBikes(dealerName));
		return "displaybikes";
	}
	
	
}
