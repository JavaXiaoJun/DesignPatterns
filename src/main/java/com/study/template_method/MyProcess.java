package com.study.template_method;

/**
 * Created by lf52 on 2018/7/28.
 */
public class MyProcess extends ProcessTemplate {

    @Override
    protected void step2() {
        System.out.println("MyProcess : start step 2");
    }

    @Override
    protected void step3() {
        System.out.println("MyProcess : start step 3");
    }

}
