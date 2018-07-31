package com.study.command;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lf52 on 2018/7/27.
 *
 * ��������ߺ͵�����
 */
public class Invoker {

    private List<Command> commands = new LinkedList<Command>();

    public void addCommand(Command command) {
        //�����Ƿ�������� or ��¼��־ ���Զ�Ҫִ�е�������ǰ�ô���
        commands.add(command);
    }

    public boolean removeCommand(Command command) {
        return commands.remove(command);
    }

    public void execute() {
        for (Command command : commands) {
            //ִ������
            command.execute();
        }
        commands.clear();
    }
}
