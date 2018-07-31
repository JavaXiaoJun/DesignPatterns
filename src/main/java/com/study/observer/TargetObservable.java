package com.study.observer;

import java.util.Observable;

/**
 * Created by lf52 on 2018/7/27.
 */
public class TargetObservable extends Observable {

    // Ҫ�۲�����ݣ���Ϣ�����ı�ʱ�����б���ӵĹ۲��߶����յ�֪ͨ
    private String message;

    public String getConent() {
        return message;
    }

    public void setMessage(String message) {
        // ���۲������ݷ����仯ʱ��ͨ���������д���֪ͨ���еĹ۲���
        this.message = message;
        this.setChanged();
        this.notifyObservers(this);
    }

}
