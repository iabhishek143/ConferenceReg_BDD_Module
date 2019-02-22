package com.cg.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
	private int id;
	private String name;
	private String rating;
	private int rate;
	private int available_rooms;
	public Hotel() {	}
	public Hotel(int id, String name, String rating, int rate, int available_rooms) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.rate = rate;
		this.available_rooms = available_rooms;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getAvailable_rooms() {
		return available_rooms;
	}
	public void setAvailable_rooms(int available_rooms) {
		this.available_rooms = available_rooms;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", rating=" + rating + ", rate=" + rate + ", available_rooms="
				+ available_rooms + "]";
	}
	
}
