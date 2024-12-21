package com.bbenjamin.models;

import lombok.ToString;

@ToString
public class SoulStone extends Stone{
    private static final String COLOR = "Green";
    private static final String NAME = "Soul Stone";
    private static final String LOCATION = "Undefined";
    private static final Integer ENERGY_LEVEL = 9;

    public SoulStone(){
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }


    @Override
    public void usePower(){
        System.out.println("Total Control: " + super.toString());
    }
}
