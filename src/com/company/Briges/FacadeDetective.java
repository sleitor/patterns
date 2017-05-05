package com.company.Briges;

/**
 * Created by User on 04.05.2017.
 */
public class FacadeDetective {;

    private Doc doc;

    public Doc makeDoc(BasicSocialWeb socialWeb, int id){

        return new Doc(socialWeb.getFriends(),socialWeb.getMoney(), socialWeb.getMessage());

    }

}
