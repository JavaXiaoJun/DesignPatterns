package com.study.singleton;

/**
 * Created by lf52 on 2018/7/27.
 * 懒汉式，静态内部类方式
 *
 * 优点：
 * 由于在调用 SingletonHolder.instance 的时候才会对单例进行初始化，而且通过反射，是不能从外部类获取内部类的属性的,所以可以很好的避免反射入侵
 * 静态内部类的特性，只有在其被第一次引用的时候才会被加载，所以可以保证其线程安全性。
 * 懒汉模式的内存优化，使用时才初始化
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
