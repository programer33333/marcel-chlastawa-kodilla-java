package com.kodilla.good.patterns.flyScanner;

import java.util.Objects;

public class Flight {

    private String flightFrom;
    private String flightTo;

    public Flight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!Objects.equals(flightFrom, flight.flightFrom)) return false;
        return Objects.equals(flightTo, flight.flightTo);
    }

    @Override
    public int hashCode() {
        int result = flightFrom != null ? flightFrom.hashCode() : 0;
        result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
        return result;
    }
}
