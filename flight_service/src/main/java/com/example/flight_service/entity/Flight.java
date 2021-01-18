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
	@Column(name = "")
	private Long flightId;
	
	@Column(name = "")
	private String flightNumber;
	
	@Column(name = "")
	private String operatingAirlines;
	
	@Column(name = "")
	private String departureCity;
	
	@Column(name = "")
	private String arrivalCity;
	
	@Column(name = "")
	private Date dateOfDeparture;
	
	@Column(name = "")
	private Timestamp estimatedDepartureTime;
	
}
