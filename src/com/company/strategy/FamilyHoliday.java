package com.company.strategy;

/**
 * Created by User on 05.05.2017.
 */
public class FamilyHoliday implements HolidayStrategy {
    @Override
    public void celebrate() {
        System.out.println("It's a family supper");
    }
}
