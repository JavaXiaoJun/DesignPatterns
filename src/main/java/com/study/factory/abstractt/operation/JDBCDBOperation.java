package com.study.factory.abstractt.operation;

import com.study.factory.Operation;

/**
 * Created by lf52 on 2018/7/28.
 */
public class JDBCDBOperation extends Operation {

    @Override
    public void execute() {
        System.out.println("JDBC DB Operation is executing");
    }

    @Override
    public void destroy() {
        System.out.println("JDBC DB Operation is destroy");
    }

}
