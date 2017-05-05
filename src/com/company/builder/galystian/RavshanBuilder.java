package com.company.builder.galystian;

import com.company.builder.HouseBuilder;

/**
 * Created by User on 03.05.2017.
 */
public class RavshanBuilder implements HouseBuilder {

    String basement;
    String walls;
    String roof;

    @Override
    public void fillBasement() {
        basement = "Ravshan *****";
    }

    @Override
    public void createWalls() {
        walls = "Ravsan red ";
    }

    @Override
    public void createRoof() {
        roof = "Ravsan line ";
    }

    public String getResult(){
        return basement + roof + walls;
    }
}
