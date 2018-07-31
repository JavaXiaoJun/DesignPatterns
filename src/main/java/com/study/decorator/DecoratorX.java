package com.study.decorator;

/**
 * Created by lf52 on 2018/7/31.
 */
public class DecoratorX extends Decorator{

    public DecoratorX(Component component) {
        super(component);
    }

    @Override
    public void opt() {
        System.out.println("ADD Some Function For Concrete Component By DecoratorX");
        super.opt();
    }
}
