package com.bbenjamin;


import com.bbenjamin.services.GauntletServicesImpl;

public class Main {
    public static void main(String[] args) {

       final var gauntletService = new GauntletServicesImpl();

            gauntletService.useGauntlet("Mind");

    }
}