package com.kodilla.exception.test;

public class FlightMain {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Oslo", "Krakow");
        searchFlight(flightFinder, flight1);
        Flight flight2 = new Flight("Stavanger", "Warsaw");
        searchFlight(flightFinder, flight2);
        Flight flight3 = new Flight("Krakow", "Wroclaw");
        searchFlight(flightFinder, flight3);
        Flight flight4 = new Flight("London", "Amsterdam");
        searchFlight(flightFinder, flight4);

    }

    private static void searchFlight(FlightFinder flightFinder, Flight flight) {
        System.out.println("Searching flight from: " + flight.getArrivalAirport() + " to " + flight.getDepartureAirport());
        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("We don't have flights to " + flight.getArrivalAirport());
        }
    }
}
