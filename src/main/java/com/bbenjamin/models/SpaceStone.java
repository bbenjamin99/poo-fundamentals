package com.bbenjamin.models;

import lombok.ToString;

@ToString
public class SpaceStone extends Stone{

    private static final String COLOR = "Purle";
    private static final String NAME = "Space Stone";
    private static final String LOCATION = "Tesseracts";
    private static final Integer ENERGY_LEVEL = 7;


    public SpaceStone(){

        super(COLOR,NAME,LOCATION, ENERGY_LEVEL );

    }


    @Override
    public void usePower(){
        System.out.println("Manipulate all space: " + super.toString());
    }
}
