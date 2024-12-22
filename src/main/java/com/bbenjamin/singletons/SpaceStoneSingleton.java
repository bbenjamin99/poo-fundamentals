package com.bbenjamin.singletons;

import com.bbenjamin.models.MindStone;
import com.bbenjamin.models.SpaceStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SpaceStoneSingleton {


    private static volatile SpaceStone spaceStoneInstance;



        public static SpaceStone getInstance(){
            if( spaceStoneInstance == null){
                log.info("Creating first instance" + MindStoneSingleton.class);
                synchronized (MindStoneSingleton.class){
                    if(spaceStoneInstance == null){
                        spaceStoneInstance = new SpaceStone();
                    }
                }
            }

            return spaceStoneInstance;

        }

}
