package com.study.proxy.staticproxy;

import com.study.proxy.RealResources;
import com.study.proxy.Resources;

/**
 * Created by lf52 on 2018/7/31.
 */
public class StaticProxyResources implements Resources {

    private RealResources realResources;
    private String fileName;

    public StaticProxyResources(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void getResource() {
       if(realResources == null){
           realResources = new RealResources(fileName);
       }
        System.out.println("Do something before ");
        realResources.getResource();
        System.out.println("Do something after ");
    }
}
