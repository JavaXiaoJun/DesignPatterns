package com.study.facade;

/**
 * Created by lf52 on 2018/8/1.
 */
public class Memory implements Hardware {
    @Override
    public void init() {
        System.out.println("Memory Start ...");
    }

    @Override
    public void destroy() {
        System.out.println("Memory Close ...");
    }
}
