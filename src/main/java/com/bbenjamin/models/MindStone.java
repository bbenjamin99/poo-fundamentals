package com.bbenjamin.models;

public class MindStone extends Stone{

    private static final String COLOR = "Blue";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "Agamotto";
    private static final Integer ENERGY_LEVEL = 5;

    public MindStone() {
        super(COLOR, NAME,LOCATION,ENERGY_LEVEL);
    }

    @Override
    public void usePower() {

    }
}
