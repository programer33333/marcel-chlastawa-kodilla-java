package com.kodilla.good.patterns.flyScanner;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        FlightScanner flightScanner = new FlightScanner();

        flightScanner.addFlight(new Flight("Wrocław", "Kraków"));
        flightScanner.addFlight(new Flight("Wrocław", "Gdańsk"));
        flightScanner.addFlight(new Flight("Kraków", "Szczecin"));
        flightScanner.addFlight(new Flight("Gdańsk", "Kraków"));
        flightScanner.addFlight(new Flight("Warszawa", "Kraków"));
        flightScanner.addFlight(new Flight("Szczecin", "Poznań"));
        flightScanner.addFlight(new Flight("Warszawa", "Katowice"));

        List<Flight> flightsFromWroclaw = flightScanner.searchByDepartureAirport("Wrocław");
        System.out.println("Flights from Wrocław:");
        for (Flight flight : flightsFromWroclaw) {
            System.out.println("-> " + flight.getFlightTo());
        }

        List<Flight> flightsToKrakow = flightScanner.searchByArrivalAirport("Kraków");
        System.out.println("\nFlights to Kraków:");
        for (Flight flight : flightsToKrakow) {
            System.out.println("From " + flight.getFlightFrom());
        }

        List<Flight> flightsWithTransfer = flightScanner.searchWitchTransfer("Warszawa", "Szczecin");
        System.out.println("\nFlights from Warszawa to Szczecin have transfer in:");
        for (Flight flight : flightsWithTransfer) {
            System.out.println(flight.getFlightFrom());
        }
    }
}
