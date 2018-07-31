package com.study.strategy;

import com.study.strategy.check.Check;
import com.study.strategy.check.PollingCheck;
import com.study.strategy.check.RandomCheck;

/**
 * Created by lf52 on 2018/7/28.
 */
public class StrategyFactory {

    private String strategy;

    private Check getCheckStrategy(){

       if("random".equals(strategy)){

           return new RandomCheck();

       }else if("polling".equals(strategy)){

           return new PollingCheck();

       }else{
           throw new RuntimeException("No this cash strategy!");
       }
    }

    public void HealthCheck(String strategy) {
        this.strategy = strategy;
        getCheckStrategy().check();
    }

}
