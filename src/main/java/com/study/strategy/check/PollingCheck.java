package com.study.strategy.check;

/**
 * Created by lf52 on 2018/7/28.
 */
public class PollingCheck extends Check {

    @Override
    public void check() {
        System.out.println("This is Polling Check");
    }

}
