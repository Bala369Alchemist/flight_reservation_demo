package com.example.flight_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight_service.entity.Flight;
import com.example.flight_service.service.FlightService;

@RestController
@RequestMapping(value = "/flights")
public class FlightRestController {

	@Autowired
	private FlightService flightServ;
	
	@GetMapping(value = "/")
	public List<Flight> getAllFlight(){
		return flightServ.getAllFlight();
	}
	
	@GetMapping(value = "/{flightId}")
	public Flight getFlight(@PathVariable Long flightId) {
		return flightServ.getFlight(flightId);
	}
	
	@PostMapping(value = "/")
	public Flight addFlight(@RequestBody Flight flight) {
		return flightServ.addFlight(flight);
	}
	
	@PutMapping(value = "/{flightId}")
	public Flight updateFlight(@PathVariable Long flightId , @RequestBody Flight flight) {
		return flightServ.updateFlight(flightId,flight);
	}
	
	@DeleteMapping(value = "/{flightId}")
	public void deleteFlight(@PathVariable Long flightId) {
		flightServ.deleteFlight(flightId);
	}
	
	@DeleteMapping(value = "/")
	public void deleteAllFlight() {
		flightServ.deleteAllFlight();
	}
	
	
}
