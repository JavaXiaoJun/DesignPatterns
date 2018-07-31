package com.study.observer;

/**
 * Created by lf52 on 2018/7/27.
 */
public class ObserverTest {

    public static void main(String[] args) {

        TargetObservable observable = new TargetObservable();

        TargetObserver one = new TargetObserver();
        one.setName("ObserverA");
        TargetObserver two = new TargetObserver();
        two.setName("ObserverB");

        // 注册观察者
        observable.addObserver(one);
        observable.addObserver(two);

        // 目标更新信息
        observable.setMessage("Hello World Everyone");
    }
}
