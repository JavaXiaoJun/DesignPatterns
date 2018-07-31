package com.study.singleton;

/**
 * Created by lf52 on 2018/7/27.
 * ����ʽ����̬�ڲ��෽ʽ
 *
 * �ŵ㣺
 * �����ڵ��� SingletonHolder.instance ��ʱ��Ż�Ե������г�ʼ��������ͨ�����䣬�ǲ��ܴ��ⲿ���ȡ�ڲ�������Ե�,���Կ��Ժܺõı��ⷴ������
 * ��̬�ڲ�������ԣ�ֻ�����䱻��һ�����õ�ʱ��Żᱻ���أ����Կ��Ա�֤���̰߳�ȫ�ԡ�
 * ����ģʽ���ڴ��Ż���ʹ��ʱ�ų�ʼ��
 */
public class StaticInnerClassLazySingleton {

    private static class SingletonHolder {
        private static final StaticInnerClassLazySingleton instance = new StaticInnerClassLazySingleton();
    }

    private StaticInnerClassLazySingleton(){
        if (SingletonHolder.instance != null) {
           throw new IllegalStateException();
         }
    }

    public static StaticInnerClassLazySingleton getInstance() {
        return SingletonHolder.instance;
    }

}
