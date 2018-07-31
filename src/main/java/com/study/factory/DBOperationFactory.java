package com.study.factory;

/**
 * Created by lf52 on 2018/7/28.
 *
 * ���������ӿ��࣬����������Operation�ĳ��󹤳���Operation�Ǹ�����ӿڣ������ж��ֲ�ͬ��ʵ��
 * Ϊ�������滻����Ҫ�������ϲ���˵��ʹ��ClientFactory��Client���ʺϡ�
 */
public interface DBOperationFactory<Operation> {

     Operation create();

     void close(Operation t);

}
