package com.oliinyk.Factory;

import com.oliinyk.impl.Cleaner;
import com.oliinyk.impl.Guardian;
import com.oliinyk.interfaces.IDepartment;
import com.oliinyk.interfaces.IPosition;

public class PositionFactory2 extends AbstractFactory {
    @Override
    public IDepartment getDepartment(String department) {
        return null;
    }

    @Override
    public IPosition getPosition(String position) {

        if (position.equalsIgnoreCase("CLEANER")) {
            return new Cleaner();
        } else if (position.equalsIgnoreCase("GUARDIAN")) {
            return new Guardian();
        }

        return null;

    }
}
