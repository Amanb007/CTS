package com.cognizant.flightmanagement.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Passenger {
	private String name;
	private boolean vip;
	
	public boolean isVip() {
		return vip;
	}
}
