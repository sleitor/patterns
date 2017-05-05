package com.company.factory;

/**
 * Created by User on 03.05.2017.
 */
public  interface WeaponFactory {

     Gun createGun();
     Revolver createRevolver();
     Rifle createRifle();
     BFG createBFG();

}
