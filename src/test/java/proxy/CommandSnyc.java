package proxy;

import java.util.concurrent.Future;

/**
 * Created by lf52 on 2018/9/30.
 */
public class CommandSnyc implements ICommand<String> {

    private  ICommand<String> commands;

    public CommandSnyc(){
        ICommand<Future<String>> command = new CommandAsnyc();
        JdkDynamicProxy proxy = new JdkDynamicProxy(command);
        commands = (ICommand) proxy.getProxy();
    }

    @Override
    public String get(String key) {
        return commands.get(key);
    }

}
