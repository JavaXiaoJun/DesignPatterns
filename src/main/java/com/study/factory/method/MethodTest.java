package com.study.factory.method;

import com.study.factory.method.factory.MethodJDBCDBOperationFactory;
import com.study.factory.method.operation.JDBCDBOperation;

/**
 * Created by lf52 on 2018/7/28.
 */
public class MethodTest {

    public static void main(String[] args) {

        MethodJDBCDBOperationFactory factory = new MethodJDBCDBOperationFactory();
        JDBCDBOperation operation = (JDBCDBOperation)factory.create();
        operation.select();
        operation.update();
        operation.delete();

    }


}
