package com.study.factory.method.factory;

import com.study.factory.DBOperationFactory;
import com.study.factory.Operation;
import com.study.factory.method.operation.JDBCDBOperation;

/**
 * Created by lf52 on 2018/7/28.
 */
public class MethodJDBCDBOperationFactory implements DBOperationFactory<Operation> {

    public Operation create() {
        return new JDBCDBOperation();
    }

    public void close(Operation t) {

    }

}
