package com.fooluodi.hole.jmm;

/**
 * Created by di on 8/1/2017.
 */
public class VolatileExample {
    int a = 0;
    //添加volatile修饰
    volatile boolean flag = false;

    //线程A
    public void writer() {
        a = 1;                   //1
        flag = true;             //2
    }

    //线程B
    public void reader() {
        if (flag) {              //3
            int i = a;           //4
        }
    }
}
