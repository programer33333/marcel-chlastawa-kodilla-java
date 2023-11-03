package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {
    private String mentorName;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TaskObservable homeworkQueue) {
        if (homeworkQueue instanceof HomeworkQueue) {
            HomeworkQueue queue = (HomeworkQueue) homeworkQueue;
            System.out.println(mentorName + " received a new task from student " + queue.getStudentName() + ": " + queue.getTasks().get(queue.getTasks().size() - 1));
        }
    }
}
