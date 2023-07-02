package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Shape test suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test: " + testCounter);
    }

    @AfterEach
    public void afterEveryTest() {
        System.out.println("Test: " + testCounter + " is finished.");
    }

    @Nested
    @DisplayName("Test on Action in the list")
    class TestOnList {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector object = new ShapeCollector();
            Shape shape = new Circle(4.3);
            //When
            object.addFigure(shape);
            //Then
            Assertions.assertEquals(1, object.getShapeList().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector object = new ShapeCollector();
            Shape shape = new Circle(3.6);
            object.addFigure(shape);
            //When
            boolean result = object.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, object.getShapeList().size());
        }

        @Test
        public void testRemoveFigureWhichDoesNotExist(){

            //Given
            ShapeCollector object = new ShapeCollector();
            object.addFigure(new Square(5));
            //When
            boolean result = object.removeFigure(new Square(4));
            //Then
            Assertions.assertFalse(result);
            Assertions.assertEquals(1, object.getShapeList().size());
        }
    }

    @Nested
    @DisplayName("Test on getting data from the list")
    class TestOnGettingData {

        @Test
        public void testGetFigureExistNumber(){

            //Given
            ShapeCollector object = new ShapeCollector();
            Shape shape = new Square(4);
            object.addFigure(shape);
            //When
            Shape shapeResult = object.getFigure(0);
            //Then
            Assertions.assertEquals(shape, shapeResult);
        }

        @Test
        public void testGetFigureNumberOutOfRange() {

            //Given
            ShapeCollector object = new ShapeCollector();
            //When
            Shape shapeResult = object.getFigure(0);
            //Then
            Assertions.assertNull(shapeResult);
        }

        @Test
        void testShowFigures() {

            //Given
            ShapeCollector object = new ShapeCollector();
            Shape shape = new Square(4);
            object.addFigure(shape);
            ArrayList<Shape> shapeList= new ArrayList<>();
            shapeList.add(shape);
            //When
            List<Shape> shapeResultList = object.showFigures();
            //Then
            Assertions.assertEquals(shapeList.toString(), shapeResultList.toString());
        }
    }
}
