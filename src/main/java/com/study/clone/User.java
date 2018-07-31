package com.study.clone;

/**
 * Created by lf52 on 2018/7/28.
 */
public class User implements Cloneable {

    private String name;
    private String sex;
    private int age;
    private Company company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public User(){

    }

    public User(String name, String sex, int age,Company company){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.company = company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new User(this.name, this.sex, this.age,(Company)this.company.clone());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", company=" + company +
                '}';
    }
}
