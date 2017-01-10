package com.fooluodi.hole.jmm;

import com.fooluodi.hole.common.Singleton;

/**
 * Created by di on 8/1/2017.
 */
public class SynchronizedLazySingleton {
    private Singleton singleton;

    public synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
