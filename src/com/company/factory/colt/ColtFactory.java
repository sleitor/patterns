package com.company.factory.colt;

import com.company.factory.*;
import com.company.factory.mauser.MauserBFG;

/**
 * Created by User on 03.05.2017.
 */
public class ColtFactory implements WeaponFactory {
    @Override
    public Gun createGun() {
        return null;
    }

    @Override
    public Revolver createRevolver() {
        return null;
    }

    @Override
    public Rifle createRifle() {
        return null;
    }

    @Override
    public BFG createBFG() {
        return new ColtBFG();
    }
}
