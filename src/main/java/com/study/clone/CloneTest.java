package com.study.clone;

/**
 * Created by lf52 on 2018/7/28.
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        User u = new User("fujun","man",18,new Company("newegg","shanghai"));
        User u1 = (User)u.clone();
       // User u1 = u;
        u1.setName("leo");
        u1.setAge(26);
        u1.getCompany().setAddr("yananxilu");
        System.out.println(u);
        System.out.println(u1);
    }
}
