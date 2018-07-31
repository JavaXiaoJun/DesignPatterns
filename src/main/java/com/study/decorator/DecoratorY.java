package com.study.decorator;

/**
 * Created by lf52 on 2018/7/31.
 */
public class DecoratorY extends Decorator{

    public DecoratorY(Component component) {
        super(component);
    }

    @Override
    public void opt() {
        System.out.println("ADD Some Function For Concrete Component By DecoratorX");
        super.opt();
    }
}
