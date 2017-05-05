package com.company.builder;

import com.company.builder.Svetlakov.Boss;
import com.company.builder.galystian.DjamshutBuilder;

/**
 * Created by User on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        DjamshutBuilder djamshutBuilder = new DjamshutBuilder();
        Boss boss = new Boss(djamshutBuilder);
        boss.build();

    }
}
