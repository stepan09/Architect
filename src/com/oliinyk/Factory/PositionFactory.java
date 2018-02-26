package com.oliinyk.Factory;

import com.oliinyk.impl.Cleaner;
import com.oliinyk.impl.Guardian;
import com.oliinyk.interfaces.IPosition;

public class PositionFactory {

    public IPosition getPosition(String positionType){
        if (positionType == null) {
            return null;
        } else if (positionType.equalsIgnoreCase("GUARDIAN")){
            return new Guardian();
        } else if (positionType.equalsIgnoreCase("CLEANER")){
            return new Cleaner();
        }

        return null;
    }
}
