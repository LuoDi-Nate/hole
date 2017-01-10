package com.fooluodi.hole.jmm;

/**
 * Created by di on 8/1/2017.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }


    public static void main(String[] args) {
        int a = 0;
        int b = a + 2;
    }
}
