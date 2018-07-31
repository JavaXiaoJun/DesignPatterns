package com.study.builder;

/**
 * Created by lf52 on 2018/7/31.
 */
public class BuilderTest {

    public static void main(String[] args) {

         Client client =  new ClientBuilder()
                                .connectString("10.16.46.171")
                                .port(8396)
                                .path("/test")
                                .create();
         client.request();
         client.show();
    }
}
