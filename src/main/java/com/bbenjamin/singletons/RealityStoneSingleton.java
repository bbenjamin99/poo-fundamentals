package com.bbenjamin.singletons;

import com.bbenjamin.models.RealityStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RealityStoneSingleton {


    private static volatile RealityStone realityStoneInstance;



    public static RealityStone getInstance(){
        if(realityStoneInstance == null){
            log.info("Creating first instance of : " + RealityStoneSingleton.class);
            synchronized (RealityStoneSingleton.class){
                if(realityStoneInstance == null){
                    realityStoneInstance = new RealityStone();
                }

            }
        }
        return realityStoneInstance;
    }
}
