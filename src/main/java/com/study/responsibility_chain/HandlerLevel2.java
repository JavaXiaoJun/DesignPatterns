package com.study.responsibility_chain;

/**
 * Created by lf52 on 2018/8/1.
 */
public class HandlerLevel2 extends RequestHandler {

    public HandlerLevel2(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Integer request) {
        if(request > 1 && request <= 3){
            System.out.println(String.format("%s approve %d day request", name, request));
        }else{
            System.out.println(String.format("%s refuse %d day request", name, request));
        }
    }
}
