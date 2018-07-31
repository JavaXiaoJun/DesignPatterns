package com.study.decorator;

/**
 * Created by lf52 on 2018/7/31.
 */
public class ComponentTest {

    public static void main(String[] args) {

        //Componentԭ���ĺ���ҵ��
        Component ca = new ConcreteComponent();

        //ͨ��DecoratorY��̬�����FunctionY
        Component cay = new DecoratorY(ca);
        //ͨ��DecoratorX��̬�����FunctionX
        Component cax = new DecoratorX(cay);

        cax.opt();
    }
}
