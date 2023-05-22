package com.kodilla.stream.world;

import java.util.Objects;
import java.util.Set;

public final class Continent {

    private  final String continentName;

    private final Set<Country> countrySet;

    public Continent(String continentName, Set<Country> countrySet) {
        this.continentName = continentName;
        this.countrySet = countrySet;
    }

    public Set<Country> getCountrySet() {
        return countrySet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (!Objects.equals(continentName, continent.continentName))
            return false;
        return Objects.equals(countrySet, continent.countrySet);
    }

    @Override
    public int hashCode() {
        int result = continentName != null ? continentName.hashCode() : 0;
        result = 31 * result + (countrySet != null ? countrySet.hashCode() : 0);
        return result;
    }
}
