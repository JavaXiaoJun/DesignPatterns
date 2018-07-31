package com.study.proxy.staticproxy;


import com.study.proxy.RealResources;
import com.study.proxy.Resources;

/**
 * Created by lf52 on 2018/7/31.
 *
 * 代理模式 VS 装饰模式：
 * 装饰模式：动态 多次性 修饰 封装对象
 * 代理模式：静态 一次性 增强 封装对象
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Resources resources = new StaticProxyResources("test.txt");
        resources.getResource();

        System.out.println("==========================");

        Resources resources1 = new RealResources("test.txt");
        resources1.getResource();
    }

}
