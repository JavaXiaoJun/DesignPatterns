package com.study.observer;

import java.util.Observable;

/**
 * Created by lf52 on 2018/7/27.
 */
public class TargetObservable extends Observable {

    // 要观察的数据：消息发生改变时，所有被添加的观察者都能收到通知
    private String message;

    public String getConent() {
        return message;
    }

    public void setMessage(String message) {
        // 被观察者数据发生变化时，通过以下两行代码通知所有的观察者
        this.message = message;
        this.setChanged();
        this.notifyObservers(this);
    }

}
