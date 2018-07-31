package com.study.factory.simple.factory;

import com.study.factory.Operation;
import com.study.factory.simple.operation.JDBCDBOperation;
import com.study.factory.simple.operation.MybatisDBOperation;

/**
 * Created by lf52 on 2018/7/28.
 */
public class SimpleDBOperationFactory {

    public static Operation create(String type) {

        if("JDBC".equals(type)){
            return new JDBCDBOperation();
        }else if("MYBATIS".equals(type)){
            return new MybatisDBOperation();
        }
        return null;

    }


}
