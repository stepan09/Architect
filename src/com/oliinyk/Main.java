package com.oliinyk;

import com.oliinyk.Factory.PositionFactory;
import com.oliinyk.impl.Guardian;
import com.oliinyk.interfaces.IPosition;

public class Main {

    public static void main(String[] args) {


        PositionFactory positionFactory = new PositionFactory();

        IPosition guardian = positionFactory.getPosition("guardian");
        guardian.work();
        guardian.rest();

        IPosition cleaner = positionFactory.getPosition("cleaner");
        cleaner.work();
        cleaner.rest();

        Guardian guardian1 = new Guardian();
        guardian1.solveCrossword();
    }
}
