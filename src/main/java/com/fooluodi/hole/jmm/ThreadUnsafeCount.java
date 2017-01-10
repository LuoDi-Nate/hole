package com.fooluodi.hole.jmm;

import com.fooluodi.hole.common.SleepUtil;

/**
 * Created by di on 8/1/2017.
 */
public class ThreadUnsafeCount {
    //添加了volatile
    private static volatile int flag = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SleepUtil.sleepSec(1);
                for (int j = 0; j < 100; j++) {
                    ThreadUnsafeCount.flag++;
                }
            }).start();
        }

        //wait while
        SleepUtil.sleepSec(5);

        System.out.println(ThreadUnsafeCount.flag);
    }
}
