package com.study.decorator;

/**
 * Created by lf52 on 2018/7/31.
 */
public class ConcreteComponent implements Component{
    @Override
    public void opt() {
        System.out.println("I AM Concrete Component");
    }
}
