package com.cognizant.patientintakesystem;

import lombok.Getter;

@Getter 
public enum Doctor {
	jai("Jai Didu"),
	aryan("Aryan Bharg"),
	saloni("Saloni Raj"),
	praveen("Praveen Gupta");
	
	private String doctorName;
	
	private Doctor(String doctorName) {
		this.doctorName = doctorName;
	}
}
