package com.study.proxy.dynamicproxy.cglib;

import org.assertj.core.internal.cglib.proxy.Enhancer;
import org.assertj.core.internal.cglib.proxy.MethodInterceptor;
import org.assertj.core.internal.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lf52 on 2018/7/31.
 */
public class cglibDynamicProxy implements MethodInterceptor {


    private Enhancer enhancer = new Enhancer();

    //获取代理对象
    public Object getInstance(Class clazz) {

        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(clazz);
        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(this);
        // 创建动态代理类对象并返回
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("Do something before ");
        //调用真正的业务方法
        Object result = methodProxy.invokeSuper(o, objects);

        System.out.println("Do something after ");

        return result;
    }


}
