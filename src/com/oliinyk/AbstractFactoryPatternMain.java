package com.oliinyk;

import com.oliinyk.Factory.AbstractFactory;
import com.oliinyk.Factory.FactoryProducer;
import com.oliinyk.interfaces.IDepartment;
import com.oliinyk.interfaces.IPosition;

public class AbstractFactoryPatternMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("DEPARTMENT");
        IDepartment department = abstractFactory.getDepartment("CLEANERS");
        department.getInfo();

        IDepartment department1 = abstractFactory.getDepartment("GUARdians");
        department1.getInfo();

        System.out.println("-----------------");

        AbstractFactory abstractFactory1 = FactoryProducer.getFactory("POSITION");
        IPosition position = abstractFactory1.getPosition("CLEANER");
        position.rest();
        position.work();

        System.out.println("--------------------");

        IPosition position1 = abstractFactory1.getPosition("GuaRdian");
        position1.work();
        position1.rest();
    }
}
