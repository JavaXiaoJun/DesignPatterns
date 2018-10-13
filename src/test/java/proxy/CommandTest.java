package proxy;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

/**
 * Created by lf52 on 2018/9/30.
 */
public class CommandTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ICommand<Future<String>> command = new CommandAsnyc();
        System.out.println("async" + command.get("leo").get());

        ICommand<String> resources = new CommandSnyc();
        System.out.println("sync" + resources.get("leo"));
    }
}
