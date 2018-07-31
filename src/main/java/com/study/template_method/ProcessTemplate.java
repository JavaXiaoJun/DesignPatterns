package com.study.template_method;

/**
 * Created by lf52 on 2018/7/28.
 */
public abstract class ProcessTemplate {

    private void step1(){
        System.out.println("ProcessTemplate : step 1 all is the same");
    }

    protected abstract void step2();

    protected abstract void step3();

    /**
     * 模板流程方法启动
     */
    public void startProcess(){
        step1();
        step2();
        step3();
    }

}
