package com.cg.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.cg.dto.Hotel;

@Repository
@Transactional
public class HotelDAO implements IHotelDAO{
	
	@PersistenceContext
	EntityManager entityManager= null;

	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public List<Hotel> displayAllHotels() {
		return entityManager.createQuery("from Hotel h", Hotel.class).getResultList();
	}
}
