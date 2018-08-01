package com.study.responsibility_chain;

/**
 * Created by lf52 on 2018/8/1.
 */
public class HandlerLevel1 extends RequestHandler {

    public HandlerLevel1(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Integer request) {
        if(request <= 1){
            System.out.println(String.format("%s approve %d day request", name, request));
        }else{
            if(nextHandler != null){
                nextHandler.handleRequest(request);
            }else{
                System.out.println("Responsibility Chain Has No Next Handler");
            }
        }
    }
}
