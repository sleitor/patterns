package com.company.builder.Svetlakov;

import com.company.builder.HouseBuilder;

/**
 * Created by User on 03.05.2017.
 */
public class Boss {
    private HouseBuilder builder;

    public Boss(HouseBuilder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.fillBasement();
        builder.createRoof();
        builder.createWalls();
        System.out.println(builder.getResult());
    }
}
