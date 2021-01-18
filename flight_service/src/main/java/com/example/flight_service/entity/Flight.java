package com.example.flight_service.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "flights")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id")
	private Long flightId;
	
	@Column(name = "flight_number")
	private String flightNumber;
	
	@Column(name = "operating_airlines")
	private String operatingAirlines;
	
	@Column(name = "departure_city")
	private String departureCity;
	
	@Column(name = "arrival_city")
	private String arrivalCity;
	
	@Column(name = "date_of_departure")
	private Date dateOfDeparture;
	
	@Column(name = "estimated_departure_time")
	private Timestamp estimatedDepartureTime;
	
}
