package com.study.factory;

/**
 * Created by lf52 on 2018/7/28.
 *
 * 操作工厂接口类，创建和销毁Operation的抽象工厂，Operation是个抽象接口，可以有多种不同的实现
 * 为了满足替换的需要，对于上层来说，使用ClientFactory比Client更适合。
 */
public interface DBOperationFactory<Operation> {

     Operation create();

     void close(Operation t);

}
