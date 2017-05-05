package com.company.builder;

/**
 * Created by User on 03.05.2017.
 */
public interface HouseBuilder {
    void fillBasement();
    void createWalls();
    void createRoof();
    String getResult();
}
