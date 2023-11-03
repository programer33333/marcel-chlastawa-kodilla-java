package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements TaskObservable {
    private List<TaskObserver> observers;
    private List<String> tasks;
    private String studentName;

    public HomeworkQueue(String studentName) {
        this.observers = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(TaskObserver taskObserver) {
        observers.add(taskObserver);
    }

    @Override
    public void removeObserver(TaskObserver taskObserver) {
        observers.remove(taskObserver);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver taskObserver : observers) {
            taskObserver.update(this);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getTasks() {
        return tasks;
    }

}
