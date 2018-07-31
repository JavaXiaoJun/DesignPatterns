package com.study.proxy;

/**
 * Created by lf52 on 2018/7/31.
 */
public class RealResources implements Resources {

    private String fileName;

    //使用cglib代理要求必须有默认的构造器
    public RealResources(){
    }

    public RealResources(String name){
        this.fileName = name;
    }

    @Override
    public void getResource() {
        System.out.println("Displaying " + fileName);
    }

}
