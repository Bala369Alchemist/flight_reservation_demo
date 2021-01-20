package com.example.flight_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flight_service.entity.Flight;
import com.example.flight_service.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository flightRepo;

	@Override
	public List<Flight> getAllFlight() {
		return flightRepo.findAll();
	}

	@Override
	public Flight getFlight(Long flightId) {
		
		return flightRepo.findByFlightId(flightId);
	}

	@Override
	public Flight addFlight(Flight flight) {
		return flightRepo.save(flight);
	}

	@Override
	public Flight updateFlight(Long flightId, Flight flight) {
		Flight currentFlight = flightRepo.findByFlightId(flightId);
		currentFlight.setFlightNumber(flight.getFlightNumber());
		currentFlight.setOperatingAirlines(flight.getOperatingAirlines());
		currentFlight.setDepartureCity(flight.getDepartureCity());
		currentFlight.setArrivalCity(flight.getArrivalCity());
		currentFlight.setDateOfDeparture(flight.getDateOfDeparture());
		currentFlight.setEstimatedDepartureTime(flight.getEstimatedDepartureTime());
		return flightRepo.save(currentFlight);
	}

	@Override
	public void deleteFlight(Long flightId) {
		flightRepo.deleteById(flightId);
	}

	@Override
	public void deleteAllFlight() {
		flightRepo.deleteAll();
	}

	
	
}
