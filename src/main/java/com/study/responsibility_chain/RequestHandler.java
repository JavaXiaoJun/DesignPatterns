package com.study.responsibility_chain;

/**
 * Created by lf52 on 2018/8/1.
 */
public abstract class RequestHandler {

    protected String name;
    //�������е���һ��Ԫ��
    protected RequestHandler nextHandler;

    public RequestHandler(String name){
        this.name = name;
    }

    public void setNextRequestHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Integer request);
}
