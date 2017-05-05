package com.company.Briges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 04.05.2017.
 */
public class PostgreDB implements DB {
    @Override
    public List<String> getListOfFriends() {
        return Arrays.asList("user1", "user2", "user3");
    }

    @Override
    public int getMoney() {
        return 150;
    }

    @Override
    public List<String> getWall() {
        return Arrays.asList("srory1","srory2","srory3");
    }

}
