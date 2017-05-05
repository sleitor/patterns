package com.company.decorator;

/**
 * Created by User on 04.05.2017.
 */
public class SMSTarif extends TarifDecorator {
    public SMSTarif(CountTarifInterface tarifDecorator) {
        super(tarifDecorator);
    }

    @Override
    public void processTarif() {
        super.processTarif();
        System.out.println("You have 100 SMS");
    }
}

