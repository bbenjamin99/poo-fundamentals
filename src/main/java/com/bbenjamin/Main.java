package com.bbenjamin;


import com.bbenjamin.services.GauntletServicesImpl;
import com.bbenjamin.singletons.RealityStoneSingleton;

public class Main {
    public static void main(String[] args) {

//       final var gauntletService = new GauntletServicesImpl();
//
//       gauntletService.useGauntlet("Mind");

        var r1 = RealityStoneSingleton.getInstance();
        var r2 = RealityStoneSingleton.getInstance();
        var r3 = RealityStoneSingleton.getInstance();

        if(r1 == r2 && r2 == r3) {
            System.out.println("Es verdadero");
        }
    }
}