package com.company.decorator;

/**
 * Created by User on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        MainTarif mainTarif = new MainTarif();
        SMSTarif smsTarif = new SMSTarif(mainTarif);
   //     InternetTariff internetTariff = new InternetTariff(smsTarif);
        RoamingTarif roamingTarif = new RoamingTarif(smsTarif);

        roamingTarif.processTarif();


    }
}
