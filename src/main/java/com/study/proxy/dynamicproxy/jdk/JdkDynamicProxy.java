package com.study.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lf52 on 2018/7/31.
 */
public class JdkDynamicProxy implements InvocationHandler {

    //Ŀ����󣨱��������
    private Object target;

    public JdkDynamicProxy(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Do something before ");
        //����������ҵ�񷽷�
        Object result=method.invoke(target, args);

        System.out.println("Do something after ");

        return result;
    }

    public Object getProxy() {
        //ͨ��������ƣ�����һ�����������ʵ�������ء��û����з�������ʱʹ��
        //�����������ʱ����Ҫ���ݸ�ҵ��������������������ȡҵ��ʵ�����Ԫ���ݣ��ڰ�װ�����ǵ���������ҵ�񷽷������ӿڡ�handlerʵ����
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }


}
