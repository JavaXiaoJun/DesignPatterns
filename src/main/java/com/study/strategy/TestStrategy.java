package com.study.strategy;

import com.study.strategy.check.Check;
import com.study.strategy.check.PollingCheck;
import org.junit.Test;

/**
 * Created by lf52 on 2018/7/28.
 */
public class TestStrategy {

    @Test
    public void testStrategy() {
        //Check check = new PollingCheck();
        Check check = new PollingCheck();
        CheckStrategy strategy = new CheckStrategy(check);
        strategy.HealthCheck();
    }

    @Test
    public void testStrategyFactory() {
        StrategyFactory factory = new StrategyFactory();
        factory.HealthCheck("random");
        factory.HealthCheck("polling");
        factory.HealthCheck("XXX");
    }
}
