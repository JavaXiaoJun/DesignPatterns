package com.study.clone;

/**
 * Created by lf52 on 2018/7/28.
 */
public class Company implements Cloneable{
    private String name;
    private String addr;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String name,String addr){
        this.name = name;
        this.addr = addr;
    }

    public Company(){

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Company(this.name, this.name);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
