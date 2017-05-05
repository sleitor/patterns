package com.company.chain;

/**
 * Created by User on 05.05.2017.
 */


public class BabkiRumors extends Rumor {

    private boolean isLive = true;

    @Override
    public void obs() {
        if (!isLive){
            System.out.println("Sorry, Babka is dead :( ");
            return;
        } else {
            System.out.println("Babka said");
            super.obs();
        }

    }

    public void setLive(boolean live) {
        this.isLive = live;
    }
}
