package com.study.factory.method.operation;

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

    public void select() {
        System.out.println("JDBC Select Operation is executing");
    }

    public void update() {
        System.out.println("JDBC Update Operation is executing");
    }

    public void delete() {
        System.out.println("JDBC Delete Operation is executing");
    }
}
