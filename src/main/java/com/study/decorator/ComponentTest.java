package com.study.decorator;

/**
 * Created by lf52 on 2018/7/31.
 */
public class ComponentTest {

    public static void main(String[] args) {

        //Component原本的核心业务
        Component ca = new ConcreteComponent();

        //通过DecoratorY动态添加了FunctionY
        Component cay = new DecoratorY(ca);
        //通过DecoratorX动态添加了FunctionX
        Component cax = new DecoratorX(cay);

        cax.opt();
    }
}
