package com.oliinyk.impl;

import com.oliinyk.interfaces.IPosition;

public class Cleaner implements IPosition {
    @Override
    public void work() {
        System.out.println("Прибиральник працює");
    }

    @Override
    public void rest() {
        System.out.println("Прибиральник відпочиває");
    }
}
