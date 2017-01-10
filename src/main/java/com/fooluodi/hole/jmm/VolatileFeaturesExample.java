package com.fooluodi.hole.jmm;

/**
 *
 */
class VolatileFeaturesExample {
    //使用volatile声明64位的long型变量
    volatile long vl = 0L;

    //单个volatile变量的写
    public void set(long l) {
        vl = l;
    }

    //复合（多个）volatile变量的读/写
    public void getAndIncrement() {
        vl++;
    }

    //单个volatile变量的读
    public long get() {
        return vl;
    }
}


class VolatileFeaturesExample2 {
    // 64位的long型普通变量
    long vl = 0L;

    //对单个的普通 变量的写用同一个监视器同步
    public synchronized void set(long l) {
        vl = l;
    }

    //普通方法调用
    public void getAndIncrement() {
        //调用已同步的读方法
        long temp = get();
        //普通写操作
        temp += 1L;
        //调用已同步的写方法
        set(temp);
    }

    public synchronized long get() {
        //对单个的普通变量的读用同一个监视器同步
        return vl;
    }
}
