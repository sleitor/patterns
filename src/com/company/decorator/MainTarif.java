package com.company.decorator;

/**
 * Created by User on 04.05.2017.
 */
public class MainTarif implements CountTarifInterface {
    @Override
    public void processTarif() {
        System.out.println("This is MTS tarif");
    }
}
