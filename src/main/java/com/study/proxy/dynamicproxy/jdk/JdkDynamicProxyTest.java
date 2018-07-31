package com.study.proxy.dynamicproxy.jdk;

import com.study.proxy.RealResources;
import com.study.proxy.Resources;

/**
 * Created by lf52 on 2018/7/31.
 */
public class JdkDynamicProxyTest {

    public static void main(String[] args) {
        RealResources realResources = new RealResources("test.txt");
        JdkDynamicProxy proxy = new JdkDynamicProxy(realResources);
        Resources resources = (Resources) proxy.getProxy();
        resources.getResource();
    }

}
