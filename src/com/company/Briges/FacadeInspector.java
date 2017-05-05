package com.company.Briges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by User on 04.05.2017.
 */
public class FacadeInspector {

    private Set<Integer> pays = new HashSet<>();

    public Set<Integer> getPays(BasicSocialWeb socialWeb, int id) {
        pays.add(socialWeb.getMoney());
        pays.add(socialWeb.getMoneyLike());
        return pays;
    }
}
