package com.study.factory.abstractt;


import com.study.factory.DBOperationFactory;
import com.study.factory.Operation;

/**
 * Created by lf52 on 2018/7/28.
 */
public class DBClient {

    private DBOperationFactory<Operation> factory;
    private Operation operation;

    public DBClient(DBOperationFactory<Operation> factory){
          this.factory = factory;
          operation = factory.create();
    }


    public void request(){
        operation.execute();
    }

    public void destroy(){
        factory.close(operation);
    }

}
