package com.company.strategy;

/**
 * Created by User on 05.05.2017.
 */
public class FriendsHoliday implements HolidayStrategy {
    @Override
    public void celebrate() {
        System.out.println("It's a friend supper");
    }
}
