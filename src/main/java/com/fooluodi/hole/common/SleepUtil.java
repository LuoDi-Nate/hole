package com.fooluodi.hole.common;

/**
 * Created by di on 8/1/2017.
 */
public class SleepUtil {
    public static void sleepSec(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
        }
    }
}
