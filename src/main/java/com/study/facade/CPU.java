package com.study.facade;

/**
 * Created by lf52 on 2018/8/1.
 */
public class CPU implements Hardware {
    @Override
    public void init() {
        System.out.println("CPU Start ...");
    }

    @Override
    public void destroy() {
        System.out.println("CPU Close ...");
    }
}
