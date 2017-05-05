package com.company.strategy;

/**
 * Created by User on 05.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setHasFamily(false);
        context.setCash(10000);
        context.setHasFriends(false);
        context.celebrate();
    }
}
