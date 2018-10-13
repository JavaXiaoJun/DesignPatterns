package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Future;

/**
 * Created by lf52 on 2018/9/30.
 */
public class JdkDynamicProxy implements InvocationHandler {
    //Ŀ����󣨱��������
    private Object target;

    public JdkDynamicProxy(Object target) {
        super();
        this.target = target;
    }

    @Override
    public String invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //����������ҵ�񷽷�
        Future<String> result=(Future<String>)method.invoke(target, args);
        return result.get();
    }

    public Object getProxy() {
        //ͨ��������ƣ�����һ�����������ʵ�������ء��û����з�������ʱʹ��
        //�����������ʱ����Ҫ���ݸ�ҵ��������������������ȡҵ��ʵ�����Ԫ���ݣ��ڰ�װ�����ǵ���������ҵ�񷽷������ӿڡ�handlerʵ����
        return  Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }
}
