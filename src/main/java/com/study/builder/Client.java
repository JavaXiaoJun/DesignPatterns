package com.study.builder;

import java.util.List;

/**
 * Created by lf52 on 2018/7/31.
 */
public class Client {

    private List<Object> param;
    public Client(List<Object> param){
        this.param = param;
    }

    //api------------------------------------------------------------
    public void request(){
        //ʹ�ò�������������Ҫʹ�õĶ���
        System.out.println(param);
    }

    public void show() {
        param.forEach(part -> System.out.println("param: " + part));
    }
}
