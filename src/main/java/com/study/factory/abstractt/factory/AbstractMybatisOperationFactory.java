package com.study.factory.abstractt.factory;

import com.study.factory.DBOperationFactory;
import com.study.factory.Operation;
import com.study.factory.abstractt.operation.MybatisDBOperation;

/**
 * Created by lf52 on 2018/7/28.
 */
public class AbstractMybatisOperationFactory implements DBOperationFactory<Operation> {

    public Operation create() {
        return new MybatisDBOperation();
    }

    public void close(Operation operation) {
        operation.destroy();
    }
}
