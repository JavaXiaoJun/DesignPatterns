package com.study.command;

/**
 * Created by lf52 on 2018/7/27.
 */
public class CommandTest {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        Invoker invoker = new Invoker();

        BuyCommand ca1 = new BuyCommand(receiver);
        SellCommand ca2 = new SellCommand(receiver);
        invoker.addCommand(ca1);
        invoker.addCommand(ca2);
        invoker.execute();
    }
}
