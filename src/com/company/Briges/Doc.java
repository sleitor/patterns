package com.company.Briges;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 04.05.2017.
 */
public class Doc {
    private List<String> friends = new ArrayList<>();
    private int pays;
    private List<String> wall = new ArrayList<>();

    public Doc(List<String> friends, int pays, List<String> wall) {
        this.friends = friends;
        this.pays = pays;
        this.wall = wall;
    }
}
