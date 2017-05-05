package com.company.factory.beretta;

import com.company.factory.*;

/**
 * Created by User on 03.05.2017.
 */
public class BerettaFactory implements WeaponFactory {
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
        return new BerettaBFG();
    }
}
