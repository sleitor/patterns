package com.company.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 04.05.2017.
 */
public class Hr implements Observerable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserbservers() {
        for (Observer observer:
                observers
             ) {
            observer.message("We have a new Job");
        }
    }
}
