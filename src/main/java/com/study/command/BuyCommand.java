package com.study.command;

/**
 * Created by lf52 on 2018/7/27.
 *
 * �����������ǳ�������������࣬ʵ�����ڳ����������������ķ���������Ӧ����Ľ����߶��󣬽������߶���Ķ��������С���ʵ��execute()����ʱ�������ý����߶������ز���(Action)��
 */
public class BuyCommand extends Command {

    private Receiver receiver;

    public BuyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    protected void execute() {
        receiver.execute("BuyCommand");
    }

}
