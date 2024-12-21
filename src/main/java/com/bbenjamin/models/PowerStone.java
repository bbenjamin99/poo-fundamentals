package com.bbenjamin.models;

import lombok.ToString;

@ToString
public class PowerStone extends Stone {

    private static final String COLOR = "Red";
    private static final String NAME = "Power Stone";
    private static final String LOCATION = "undefined";
    private static final Integer ENERGY_LEVEL = 9;

    public PowerStone(){
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower(){
        System.out.println("Increase Power & Energy : " + super.toString());
    };
}
