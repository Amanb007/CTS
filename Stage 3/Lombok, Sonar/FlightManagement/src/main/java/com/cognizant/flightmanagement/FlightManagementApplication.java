package com.cognizant.flightmanagement;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.flightmanagement.model.Flight;
import com.cognizant.flightmanagement.model.Passenger;

@SpringBootApplication
public class FlightManagementApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(FlightManagementApplication.class);
	private static Flight f1 = new Flight();
	private static Flight f2 = new Flight();

	public static void main(String[] args) {
		//SpringApplication.run(FlightManagementApplication.class, args);

		Passenger p1 = new Passenger("Aman",true);
		Passenger p2 = new Passenger("Jai",true);
		Passenger p3 = new Passenger("Aryan",false);
		Passenger p4 = new Passenger("Akshit",false);
		
		
		f1.setFlightType("economy");
		LOGGER.info("Economy flight added..");	
		LOGGER.info(Boolean.toString(f1.addPassenger(p1)));
		LOGGER.info(Boolean.toString(f1.addPassenger(p3)));
		
		f2.setFlightType("business");
		LOGGER.info("Business flight added..");
		LOGGER.info(Boolean.toString(f2.addPassenger(p2)));
		LOGGER.info(Boolean.toString(f2.addPassenger(p4)));
		
		LOGGER.info(Boolean.toString(f1.removePassenger(p1)));
		LOGGER.info(Boolean.toString(f2.removePassenger(p2)));
		LOGGER.info(Boolean.toString(f1.removePassenger(p3)));
		LOGGER.info(Boolean.toString(f2.removePassenger(p4)));
		
		
		
		

		
		
		
		
		
		

		
	}

}
