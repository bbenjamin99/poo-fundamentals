package com.bbenjamin.services;


import com.bbenjamin.models.RealityStone;
import com.bbenjamin.models.Stone;
import com.bbenjamin.singletons.MindStoneSingleton;
import lombok.extern.java.Log;

//@Service
@Log
public class GauntletServicesImpl implements GauntletServices {

    private final Stone reality = MindStoneSingleton.getInstance();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("Use Stone: " + reality);
    }
}
