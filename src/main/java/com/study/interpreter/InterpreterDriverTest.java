package com.study.interpreter;

/**
 * Created by lf52 on 2018/8/1.
 */
public class InterpreterDriverTest {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.calculate("1 + 2 * 3 + ( 4 + ( 5 + 2 ) / 10 )"));
        System.out.println(c.calculate("3 * ( 5 + 10 ) / 2"));
    }
}
