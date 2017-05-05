package com.company.chain;

/**
 * Created by User on 05.05.2017.
 */
public class InternetRumors extends Rumor {
    boolean isConnected=true;

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    @Override
    public void obs() {
        if (!isConnected){
            System.out.println("Sorry, connection is lost");
            return;
        }
        System.out.println("Internet said");
        super.obs();
    }
}
