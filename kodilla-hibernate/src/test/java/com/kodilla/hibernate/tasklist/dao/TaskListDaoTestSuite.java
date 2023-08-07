package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "LIST_NAME";
    private static final String DESCRIPTION = "DESCRIPTION 1";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(NAME, DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByName(name);

        //Then
        assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}
