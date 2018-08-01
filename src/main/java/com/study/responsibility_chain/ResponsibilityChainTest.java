package com.study.responsibility_chain;

/**
 * Created by lf52 on 2018/8/1.
 */
public class ResponsibilityChainTest {

    public static void main(String[] args) {

        RequestHandler handler1 =new HandlerLevel1("PM");
        RequestHandler handler2 =new HandlerLevel2("Domain");
        handler1.setNextRequestHandler(handler2);

        Integer[] reqs = {1, 2, 3, 4, 5};

        for (Integer req : reqs) {
            handler1.handleRequest(req);
        }
    }
}
