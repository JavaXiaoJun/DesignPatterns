package com.study.facade;

/**
 * Created by lf52 on 2018/8/1.
 */
public class FacadeTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();

        System.out.println("After 1 Day ...");

        computer.closeComputer();
    }

}
