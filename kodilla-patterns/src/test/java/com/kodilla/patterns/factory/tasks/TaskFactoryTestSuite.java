package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    void testPaintingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.doTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testShoppingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.doTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testDrivingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.doTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();
        //Then
        assertEquals("Drive", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());
    }

}
