package com.company.decorator;

/**
 * Created by User on 04.05.2017.
 */
public class RoamingTarif extends TarifDecorator {
    public RoamingTarif(CountTarifInterface tarifDecorator) {
        super(tarifDecorator);
    }

    @Override
    public void processTarif() {
        super.processTarif();
        System.out.println("You have 10 days in roaming");
    }
}
