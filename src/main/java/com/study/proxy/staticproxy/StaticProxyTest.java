package com.study.proxy.staticproxy;


import com.study.proxy.RealResources;
import com.study.proxy.Resources;

/**
 * Created by lf52 on 2018/7/31.
 *
 * ����ģʽ VS װ��ģʽ��
 * װ��ģʽ����̬ ����� ���� ��װ����
 * ����ģʽ����̬ һ���� ��ǿ ��װ����
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
