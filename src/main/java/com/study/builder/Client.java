package com.study.builder;

import java.util.List;

/**
 * Created by lf52 on 2018/7/31.
 */
public class Client {

    private List<Object> param;
    public Client(List<Object> param){
        this.param = param;
    }

    //api------------------------------------------------------------
    public void request(){
        //使用参数构建真正需要使用的对象
        System.out.println(param);
    }

    public void show() {
        param.forEach(part -> System.out.println("param: " + part));
    }
}
