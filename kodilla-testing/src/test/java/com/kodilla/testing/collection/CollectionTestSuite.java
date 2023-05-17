package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When created OddNumbersExterminator's list , " +
            "then empty List should be equal to OddNumbersExterminator's list"
    )

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName("When created OddNumbersExterminator's list , " +
            "expected result list should be equal to OddNumbersExterminator's list"
    )

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(15);
        normalList.add(2);
        normalList.add(4);
        normalList.add(6);
        normalList.add(8);
        normalList.add(1);

        ArrayList<Integer> expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(6);
        expectedResultList.add(8);
        //When
        List<Integer> resultList = OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}
