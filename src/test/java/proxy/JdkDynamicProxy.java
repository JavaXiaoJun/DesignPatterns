package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Future;

/**
 * Created by lf52 on 2018/9/30.
 */
public class JdkDynamicProxy implements InvocationHandler {
    //目标对象（被代理对象）
    private Object target;

    public JdkDynamicProxy(Object target) {
        super();
        this.target = target;
    }

    @Override
    public String invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用真正的业务方法
        Future<String> result=(Future<String>)method.invoke(target, args);
        return result.get();
    }

    public Object getProxy() {
        //通过反射机制，创建一个代理类对象实例并返回。用户进行方法调用时使用
        //创建代理对象时，需要传递该业务类的类加载器（用来获取业务实现类的元数据，在包装方法是调用真正的业务方法）、接口、handler实现类
        return  Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }
}
