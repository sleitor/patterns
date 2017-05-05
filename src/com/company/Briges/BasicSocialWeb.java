package com.company.Briges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 04.05.2017.
 */
public class BasicSocialWeb implements SocialWeb {

    private DB postgreDB = new PostgreDB();

    private List<String> friends = new ArrayList<>();
    private int money = 0;
    private List<String> message = Arrays.asList("notify1", "notify2");
    @Override
    public List<String> getFriends() {
        friends.add("Alexey");
        friends.add("Denis");
        friends.add("Petya");
        return postgreDB.getListOfFriends();
    }

    public DB getPostgreDB() {
        return postgreDB;
    }

    public int getMoney() {
        return money;
    }

    public int getMoneyLike() {
        return money;
    }

    public List<String> getMessage() {
        return message;
    }

    @Override
    public void pay(int value) {
        money += postgreDB.getMoney() + value;
    }

    @Override
    public void payLike(int value) { money += postgreDB.getMoney() + value; }

    @Override
    public List<String> wall() {
        return postgreDB.getListOfFriends();

    }
}
