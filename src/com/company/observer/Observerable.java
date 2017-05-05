package com.company.observer;

/**
 * Created by User on 04.05.2017.
 */
public interface Observerable {
    void registerObserver(Observer observer);
    void removeObserver( Observer observer);
    void notifyAllObserbservers();
}
