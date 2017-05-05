package com.company.Briges;

import java.util.List;

/**
 * Created by User on 04.05.2017.
 */
public interface SocialWeb {
    List<String> getFriends();

    void pay(int value);

    void payLike(int value);

    List<String> wall();

}
