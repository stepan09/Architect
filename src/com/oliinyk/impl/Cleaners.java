package com.oliinyk.impl;

import com.oliinyk.interfaces.IDepartment;

public class Cleaners implements IDepartment {

    @Override
    public void getInfo() {
        System.out.println("Підрозділ прибиральників.");
    }

}
