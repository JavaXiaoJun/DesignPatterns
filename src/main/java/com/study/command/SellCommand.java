package com.study.command;

/**
 * Created by lf52 on 2018/7/27.
 *
 * 具体命令类是抽象命令类的子类，实现了在抽象命令类中声明的方法，它对应具体的接收者对象，将接收者对象的动作绑定其中。在实现execute()方法时，将调用接收者对象的相关操作(Action)。
 */
public class SellCommand extends Command {

    private Receiver receiver;

    public SellCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    protected void execute() {
        receiver.execute("SellCommand");
    }

}
