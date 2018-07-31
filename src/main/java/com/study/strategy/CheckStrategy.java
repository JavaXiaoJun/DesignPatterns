package com.study.strategy;

import com.study.strategy.check.Check;

/**
 * Created by lf52 on 2018/7/28.
 */
public class CheckStrategy {

    private Check check;

    public CheckStrategy(Check check){
        this.check = check;
    }

    public void HealthCheck() {
        check.check();
    }
}
