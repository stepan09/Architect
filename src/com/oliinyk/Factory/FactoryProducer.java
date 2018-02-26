package com.oliinyk.Factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {

        if (factory.equalsIgnoreCase("DEPARTMENT")){
            return new DepartmentFactory();
        } else if (factory.equalsIgnoreCase("POSITION")) {
            return new PositionFactory2();
        }

        return null;
    }
}
