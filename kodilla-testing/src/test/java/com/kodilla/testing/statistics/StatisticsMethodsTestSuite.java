package com.kodilla.testing.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StatisticsMethodsTestSuite {

    private static int testCounter = 0;

    private List<String> generateListNOfUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n < usersQuantity; n++) {
            String object = "User" + n;
            resultList.add(object);
        }
        return resultList;
    }

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

    @Mock
    private Statistics statisticsMock;

    @DisplayName("Test 1")
    @Test
    void testCalculateAdvStatisticsWhilePostsQuantity0() {
        //Given
        StatisticsMethods statisticsMethods = new StatisticsMethods(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1"));
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        statisticsMethods.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0,statisticsMethods.getPostsQuantity());
        assertEquals(0, statisticsMethods.getAverageQuantityPostsPerUser());
        assertEquals(10, statisticsMethods.getAverageQuantityCommentsPerUser());
        assertEquals(0, statisticsMethods.getAverageQuantityCommentsPerPost());

    }

    @DisplayName("Test 2")
    @Test
    void testCalculateAdvStatisticsWhilePostsQuantity100() {
        //Given
        StatisticsMethods statisticsMethods = new StatisticsMethods(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1"));
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        statisticsMethods.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, statisticsMethods.getPostsQuantity());
        assertEquals(100, statisticsMethods.getAverageQuantityPostsPerUser());
        assertEquals(1, statisticsMethods.getAverageQuantityCommentsPerPost());
        assertEquals(100, statisticsMethods.getAverageQuantityCommentsPerUser());
    }

    @DisplayName("Test 3")
    @Test
    void testCalculateAdvStatisticsWhileCommentsQuantity0() {
        //Given
        StatisticsMethods statisticsMethods = new StatisticsMethods(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1"));
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        statisticsMethods.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsMethods.getCommentsQuantity());
        assertEquals(0, statisticsMethods.getAverageQuantityCommentsPerUser());
        assertEquals(0, statisticsMethods.getAverageQuantityCommentsPerPost());
        assertEquals(100, statisticsMethods.getAverageQuantityPostsPerUser());
    }

    @DisplayName("Test 4")
    @Test
    void testCalculateAdvStatisticsWhilePostsQuantityBiggerThanCommentQuantity() {
        //Given
        StatisticsMethods statisticsMethods = new StatisticsMethods(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1"));
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(20);

        //When
        statisticsMethods.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, statisticsMethods.getCommentsQuantity());
        assertEquals(20, statisticsMethods.getPostsQuantity());
        assertEquals(20, statisticsMethods.getAverageQuantityPostsPerUser());
        assertEquals(10, statisticsMethods.getAverageQuantityCommentsPerUser());
        assertEquals(0.5, statisticsMethods.getAverageQuantityCommentsPerPost());
    }

    @DisplayName("Test 5")
    @Test
    void testCalculateAdvStatisticsWhileCommentQuantityBiggerThanPostsQuantity() {
        //Given
        StatisticsMethods statisticsMethods = new StatisticsMethods(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1"));
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(5);

        //When
        statisticsMethods.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, statisticsMethods.getCommentsQuantity());
        assertEquals(5, statisticsMethods.getPostsQuantity());
        assertEquals(5, statisticsMethods.getAverageQuantityPostsPerUser());
        assertEquals(10, statisticsMethods.getAverageQuantityCommentsPerUser());
        assertEquals(2, statisticsMethods.getAverageQuantityCommentsPerPost());
    }

    @DisplayName("Test 6")
    @Test
    void testCalculateAdvStatisticsWhileUsersQuantity0() {
        //Given
        StatisticsMethods statisticsMethods = new StatisticsMethods(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Collections.emptyList());
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(5);

        //When
        statisticsMethods.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsMethods.getUsersQuantity());
        assertEquals(0, statisticsMethods.getAverageQuantityPostsPerUser());
        assertEquals(0, statisticsMethods.getAverageQuantityCommentsPerUser());
        assertEquals(2, statisticsMethods.getAverageQuantityCommentsPerPost());
    }

    @DisplayName("Test 7")
    @Test
    void testCalculateAdvStatisticsWhileUsersQuantity100() {
        //Given
        StatisticsMethods statisticsMethods = new StatisticsMethods(statisticsMock);
        List<String> listOf100Users = generateListNOfUsers(101);
        when(statisticsMock.usersNames()).thenReturn(listOf100Users);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        statisticsMethods.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, statisticsMethods.getUsersQuantity());
        assertEquals(0.1, statisticsMethods.getAverageQuantityPostsPerUser());
        assertEquals(0.1, statisticsMethods.getAverageQuantityCommentsPerUser());
        assertEquals(1, statisticsMethods.getAverageQuantityCommentsPerPost());
    }
}
