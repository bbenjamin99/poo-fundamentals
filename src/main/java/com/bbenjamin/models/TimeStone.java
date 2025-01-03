package com.bbenjamin.models;

import lombok.ToString;

@ToString
public class TimeStone extends Stone{

    private static final String COLOR = "Green";
    private static final String NAME = "Time Stone";
    private static final String LOCATION = "Agamotto";
    private static final Integer ENERGY_LEVEL = 9;

    public TimeStone(){
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }


    @Override
    public void usePower(){
        System.out.println("Control Time: " + super.toString());
    }
}
