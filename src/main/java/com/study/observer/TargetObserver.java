package com.study.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lf52 on 2018/7/27.
 */
public class TargetObserver implements Observer {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        //������Ϣ����
        System.out.println(name + " get Message From Observable : "
                + ((TargetObservable) arg).getConent());
    }

}
