package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkQueueTestSuite {

    @Test
    public void testHomeworkApp() {
        //Given
        HomeworkQueue student1Queue = new HomeworkQueue("Student 1");
        HomeworkQueue student2Queue = new HomeworkQueue("Student 2");

        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");

        //When
        student1Queue.registerObserver(mentor1);
        student2Queue.registerObserver(mentor2);

        student1Queue.addTask("Task 1");
        student2Queue.addTask("Task 1");
        student1Queue.addTask("Task 2");
        student2Queue.addTask("Task 2");

        //Then
        Assertions.assertEquals(2, student1Queue.getTasks().size());
        Assertions.assertEquals(2, student2Queue.getTasks().size());
    }
}
