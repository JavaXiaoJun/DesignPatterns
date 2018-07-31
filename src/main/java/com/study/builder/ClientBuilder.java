package com.study.builder;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lf52 on 2018/7/31.
 */
public class ClientBuilder implements IBuilder {

    private List<Object> param = new LinkedList();

    public ClientBuilder connectString(String connectString)
    {
        param.add(connectString);
        return this;
    }

    public ClientBuilder port(Integer port)
    {
        param.add(port);
        return this;
    }

    public ClientBuilder path(String path)
    {
        param.add(path);
        return this;
    }

    public Client create()
    {
        return new Client(this.param);
    }
}
