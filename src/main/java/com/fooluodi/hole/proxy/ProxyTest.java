package com.fooluodi.hole.proxy;

/**
 * Created by di on 17/1/2017.
 */
public class ProxyTest {
    public static void main(String[] args) {

    }
}

interface Subject{
    void request();
}

class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("real!!");
    }
}

class Proxy implements Subject{
    private Subject subject;
    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("pre");
        subject.request();
        System.out.println("after");
    }
}
