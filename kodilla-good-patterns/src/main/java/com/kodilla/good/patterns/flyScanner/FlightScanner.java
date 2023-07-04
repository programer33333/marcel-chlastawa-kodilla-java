package com.kodilla.good.patterns.flyScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightScanner {
    private final List<Flight> flights;

    public FlightScanner() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> searchByDepartureAirport(String flightFrom) {
        return flights.stream()
                .filter(f -> f.getFlightFrom().equals(flightFrom))
                .collect(Collectors.toList());
    }

    public List<Flight> searchByArrivalAirport(String flightTo) {
        return flights.stream()
                .filter(f -> f.getFlightTo().equals(flightTo))
                .collect(Collectors.toList());
    }

    public List<Flight> searchWitchTransfer(String flightFrom, String flightTo) {
        List<Flight> list = flights.stream()
                .filter(flight -> flight.getFlightFrom().equals(flightFrom))
                .toList();

        return flights.stream()
                .filter(flight -> list.stream()
                        .anyMatch(f -> f.getFlightTo().equals(flight.getFlightFrom())))
                .filter(flight -> flight.getFlightTo().equals(flightTo))
                .collect(Collectors.toList());

    }
}