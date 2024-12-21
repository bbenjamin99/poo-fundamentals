package com.bbenjamin.models;

import lombok.ToString;

@ToString
public class RealityStone extends Stone {

    private static final String COLOR = "Yellow";
    private static final String NAME = "Reality Stone";
    private static final String LOCATION = "Asgard";
    private static final Integer ENERGY_LEVEL = 6;


    public RealityStone(){
        super(COLOR,NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
            // Business Logic
        System.out.println("Alter reality: " + super.toString());

        }
}
