package com.company.chain;

/**
 * Created by User on 05.05.2017.
 */
public class Main {


    public static void main(String[] args) {
        BabkiRumors babkiRumors = new BabkiRumors();
        babkiRumors.setMessage("Stings are wery populary in Innopolice");
        babkiRumors.setLive(false);
        NewspaperRumors newspaperRumors = new NewspaperRumors();
        newspaperRumors.setBalance(11000L);
        InternetRumors internetRumors = new InternetRumors();
        internetRumors.setConnected(false);
        babkiRumors.setRumor(newspaperRumors);
        newspaperRumors.setRumor(internetRumors);
        babkiRumors.obs();
    }
}
