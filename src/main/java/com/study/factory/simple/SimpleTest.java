package com.study.factory.simple;


import com.study.factory.Operation;
import com.study.factory.simple.factory.SimpleDBOperationFactory;

/**
 * Created by lf52 on 2018/7/28.
 */
public class SimpleTest {

    public static void main(String[] args) {

        Operation operation = SimpleDBOperationFactory.create("JDBC");
        operation.execute();
        Operation operation1 = SimpleDBOperationFactory.create("MYBATIS");
        operation1.execute();

    }
}
