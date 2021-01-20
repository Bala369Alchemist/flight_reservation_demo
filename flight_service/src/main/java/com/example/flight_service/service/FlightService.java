package com.example.flight_service.service;

import java.util.List;

import com.example.flight_service.entity.Flight;

public interface FlightService {

	List<Flight> getAllFlight();

	Flight getFlight(Long flightId);

	Flight addFlight(Flight flight);

	Flight updateFlight(Long flightId, Flight flight);

	void deleteFlight(Long flightId);

	void deleteAllFlight();

}
