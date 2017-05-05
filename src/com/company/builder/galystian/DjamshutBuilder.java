package com.company.builder.galystian;

import com.company.builder.HouseBuilder;

/**
 * Created by User on 03.05.2017.
 */
public class DjamshutBuilder implements HouseBuilder {
    static String basement;
    static String walls;
    static String roof;

    @Override
    public void fillBasement() {
        basement = "*****";
    }

    @Override
    public void createWalls() {
        walls = "red";
    }

    @Override
    public void createRoof() {
        roof = "line ";
    }

    public String getResult(){
        return basement + roof + walls;
    }

}
