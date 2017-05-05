package com.company.decorator;

/**
 * Created by User on 04.05.2017.
 */
public class InternetTariff extends TarifDecorator {
    @Override
    public void processTarif() {
        super.processTarif();
        System.out.println("You have a 10 Gb Internet");
    }

    public InternetTariff(CountTarifInterface tarifDecorator) {
        super(tarifDecorator);
    }
}
