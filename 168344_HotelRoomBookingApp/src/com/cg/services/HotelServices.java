package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IHotelDAO;
import com.cg.dto.Hotel;

@Service
public class HotelServices implements IHotelServices{
	
	@Autowired
	IHotelDAO dao= null;
	
	public IHotelDAO getDao() {
		return dao;
	}
	public void setDao(IHotelDAO dao) {
		this.dao = dao;
	}
	/***********Display All Hotel Details Method, Return List***********/
	@Override
	public List<Hotel> displayAllHotels() {
		return dao.displayAllHotels();
	}

}
