package com.study.factory.abstractt.factory;


import com.study.factory.DBOperationFactory;
import com.study.factory.abstractt.operation.JDBCDBOperation;
import com.study.factory.Operation;

/**
 * Created by lf52 on 2018/7/28.
 */
public class AbstractJDBCOperationFactory implements DBOperationFactory<Operation> {

    public Operation create() {
        return new JDBCDBOperation();
    }

    public void close(Operation operation) {
        operation.destroy();
    }

}
