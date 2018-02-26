package com.oliinyk.impl;

import com.oliinyk.interfaces.IDepartment;

public class Guardians implements IDepartment {

    @Override
    public void getInfo() {
        System.out.println("Підрозділ охоронців.");
    }
}
