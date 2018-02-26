package com.oliinyk.Factory;

import com.oliinyk.impl.Cleaners;
import com.oliinyk.impl.Guardians;
import com.oliinyk.interfaces.IDepartment;
import com.oliinyk.interfaces.IPosition;

public class DepartmentFactory extends AbstractFactory {


    @Override
    public IDepartment getDepartment(String department) {

        if (department.equalsIgnoreCase("cleaners")) {
            return new Cleaners();
        } else if (department.equalsIgnoreCase("guardians")) {
            return new Guardians();
        }

        return null;
    }

    @Override
    public IPosition getPosition(String position) {
        return null;
    }
}
