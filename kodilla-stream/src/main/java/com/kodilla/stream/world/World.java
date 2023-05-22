package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;

public class World {

    private final Set<Continent> continentsSet;

    public World(Set<Continent> continentsSet) {
        this.continentsSet = continentsSet;
    }

    public BigDecimal getPeopleQuantity() {
        return continentsSet.stream()
                .flatMap(country -> country.getCountrySet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
