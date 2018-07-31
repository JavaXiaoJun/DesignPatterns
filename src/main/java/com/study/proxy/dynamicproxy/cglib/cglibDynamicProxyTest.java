package com.study.proxy.dynamicproxy.cglib;


/**
 * Created by lf52 on 2018/7/31.
 */
public class cglibDynamicProxyTest {

    public static void main(String[] args) {
        RealResources realResources = new RealResources();
        cglibDynamicProxy proxy = new cglibDynamicProxy();
        RealResources resources = (RealResources) proxy.getInstance(realResources.getClass());
        resources.getResource("test.txt");
    }

}
