package com.study.command;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lf52 on 2018/7/27.
 *
 * 请求接收者和调用者
 */
public class Invoker {

    private List<Command> commands = new LinkedList<Command>();

    public void addCommand(Command command) {
        //决定是否过滤请求 or 记录日志 可以对要执行的命令做前置处理
        commands.add(command);
    }

    public boolean removeCommand(Command command) {
        return commands.remove(command);
    }

    public void execute() {
        for (Command command : commands) {
            //执行请求
            command.execute();
        }
        commands.clear();
    }
}
