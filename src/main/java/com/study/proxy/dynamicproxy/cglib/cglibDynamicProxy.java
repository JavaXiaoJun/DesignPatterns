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

    //��ȡ�������
    public Object getInstance(Class clazz) {

        //Ϊ��ǿ��ָ��Ҫ�����ҵ���ࣨ����Ϊ�������ɵĴ�����ָ�����ࣩ
        enhancer.setSuperclass(clazz);
        //���ûص������ڴ����������з����ĵ��ã��������CallBack����Callback����Ҫʵ��intercept()����������
        enhancer.setCallback(this);
        // ������̬��������󲢷���
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("Do something before ");
        //����������ҵ�񷽷�
        Object result = methodProxy.invokeSuper(o, objects);

        System.out.println("Do something after ");

        return result;
    }


}
