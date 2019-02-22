package com.cg.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.dto.Hotel;
import com.cg.services.IHotelServices;

@Controller
public class HotelController {
	@Autowired
	IHotelServices services= null;

	public IHotelServices getServices() {
		return services;
	}
	public void setServices(IHotelServices services) {
		this.services = services;
	}
	
	/*****************************Hotel Details Page***************************/
	@RequestMapping(value="HotelDetailsPage", method=RequestMethod.GET)
	public String displayHotelDetails(ArrayList<Hotel> hotels, Model model) {
		hotels= (ArrayList<Hotel>) services.displayAllHotels();
		model.addAttribute("hotels", hotels);
		return "HotelDetails";
	}
	
	/*****************************Confirmation Page***************************/
	@RequestMapping(value="ConfirmationPage", method=RequestMethod.GET)
	public String displayBookingCnfPage(@RequestParam(value="uid") String name ,Model model) {
		model.addAttribute("msg",name);
		return "BookingConfirmation";
	}
}
