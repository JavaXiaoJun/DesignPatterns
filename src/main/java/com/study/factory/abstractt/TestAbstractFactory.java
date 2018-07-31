package com.study.factory.abstractt;

import com.study.factory.abstractt.factory.AbstractJDBCOperationFactory;
import com.study.factory.abstractt.factory.AbstractMybatisOperationFactory;

/**
 * Created by lf52 on 2018/7/28.
 */
public class TestAbstractFactory {

    //Client�����伴�ã�ͨ������������OperationFactory������Client�����������ټ���
    private static final AbstractJDBCOperationFactory jdbcOperationFactory = new AbstractJDBCOperationFactory();
    private static final AbstractMybatisOperationFactory mybatisOperationFactory = new AbstractMybatisOperationFactory();

    public static void main(String[] args) {

        DBClient client = new DBClient(jdbcOperationFactory);
        //DBClient client = new DBClient(mybatisOperationFactory);
        client.request();
        client.destroy();

    }

}
