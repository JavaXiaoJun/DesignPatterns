package proxy;


/**
 * Created by lf52 on 2018/9/30.
 */
public interface ICommand<T> {

    T get(String key);

}
