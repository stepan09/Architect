package com.oliinyk.Factory;

import com.oliinyk.interfaces.IDepartment;
import com.oliinyk.interfaces.IPosition;

public abstract class AbstractFactory {

    public abstract IDepartment getDepartment(String department);
    public abstract IPosition getPosition(String position);

}
