package com.company.observer;

/**
 * Created by User on 04.05.2017.
 */
public class Worker implements Observer {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void message(String message) {
        System.out.println(message + " " + id+ " worker ID");
    }
}
