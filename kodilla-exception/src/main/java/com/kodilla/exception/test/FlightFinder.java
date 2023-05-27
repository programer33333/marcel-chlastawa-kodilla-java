package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    private HashMap<String, Boolean> airportMap;

    public FlightFinder() {
        airportMap = new HashMap<String, Boolean>();
        airportMap.put("Oslo", false);
        airportMap.put("Wroclaw", true);
        airportMap.put("Stavanger", false);
        airportMap.put("Krakow", true);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (airportMap.containsKey(flight.getArrivalAirport()) == false) {
            throw new RouteNotFoundException("Route not found for " + flight.getArrivalAirport());
        }

        boolean isPossible = airportMap.get(flight.getArrivalAirport());
        if (isPossible == false) {
            System.out.println("Sorry, there are no available flights to " + flight.getArrivalAirport());
        }

        System.out.println("There are available flights to " + flight.getArrivalAirport());
    }
}
