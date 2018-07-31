package com.study.factory.abstractt.operation;

import com.study.factory.Operation;

/**
 * Created by lf52 on 2018/7/28.
 */
public class MybatisDBOperation extends Operation {

    @Override
    public void execute() {
        System.out.println("Mybatis DB Operation is executing");
    }

    @Override
    public void destroy() {
        System.out.println("Mybatis DB Operation is destroy");
    }

}
