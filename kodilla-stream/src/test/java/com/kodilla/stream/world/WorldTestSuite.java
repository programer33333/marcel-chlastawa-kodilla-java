package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {

        //Given
        Set<Country> europeSet = new HashSet<>();
        europeSet.add(new Country("Polska", new BigDecimal("38000000")));
        europeSet.add(new Country("Germany", new BigDecimal("83000000")));

        Set<Country> asiaSet = new HashSet<>();
        asiaSet.add(new Country("China", new BigDecimal("1400050000")));
        asiaSet.add(new Country("Nepal", new BigDecimal("30500000")));

        Set<Country> nAmericaSet = new HashSet<>();
        nAmericaSet.add(new Country("USA", new BigDecimal("331000000")));
        nAmericaSet.add(new Country("Kanada", new BigDecimal("34000000")));

        Continent europe = new Continent("Europe", europeSet);
        Continent asia = new Continent("Asia", asiaSet);
        Continent northAmerica = new Continent("North America", nAmericaSet);

        Set<Continent> continentSet = new HashSet<>();
        continentSet.add(europe);
        continentSet.add(asia);
        continentSet.add(northAmerica);

        World world = new World(continentSet);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("1916550000"), totalPopulation);
    }
}
