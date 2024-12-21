package com.bbenjamin.services;


import com.bbenjamin.models.RealityStone;
import com.bbenjamin.models.Stone;
import lombok.extern.java.Log;

//@Service
@Log
public class GauntletServicesImpl implements GauntletServices {

    private final Stone reality = new RealityStone();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("Use Stone: " + reality);
    }
}
