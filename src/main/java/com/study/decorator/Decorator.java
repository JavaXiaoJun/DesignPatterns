package com.study.decorator;

/**
 * Created by lf52 on 2018/7/31.
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void opt() {
        component.opt();
    }

}
