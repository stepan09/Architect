package com.oliinyk.impl;

import com.oliinyk.interfaces.IPosition;

public class Guardian implements IPosition {
    @Override
    public void work() {
        System.out.println("Охоронець працює");
    }

    @Override
    public void rest() {
        System.out.println("Охоронець відпочиває");
    }

    public void solveCrossword(){
        System.out.println("Охоронець 'працює'");
    }
}
