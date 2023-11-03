package com.kodilla.patterns2.observer.homework;

public interface TaskObservable {
    void registerObserver(TaskObserver taskObserver);
    void removeObserver(TaskObserver taskObserver);
    void notifyObservers();
}
