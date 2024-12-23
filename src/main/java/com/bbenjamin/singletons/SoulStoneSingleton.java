package com.bbenjamin.singletons;

import com.bbenjamin.models.RealityStone;
import com.bbenjamin.models.SoulStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SoulStoneSingleton {


    private static volatile SoulStone soulStoneInstance;



    public static SoulStone getInstance(){
        if(soulStoneInstance == null){
            log.info("Creating first instance of : " + RealityStoneSingleton.class);
            synchronized (SoulStoneSingleton.class){
                if(soulStoneInstance == null){
                    soulStoneInstance = new SoulStone();
                }

            }
        }
        return soulStoneInstance;
    }
}
