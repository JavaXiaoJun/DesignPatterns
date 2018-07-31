package com.study.singleton;

/**
 * Created by lf52 on 2018/7/27.
 * ����ʽ��˫��У�鷽ʽ
 *
 * ���á�Java �������ʵս���еĻ���
 * ��ʹ��ģʽ���ֵ����������޾���ͬ����ִ���ٶȺ������Լ� JVM ����ʱ�������Ѿ����������ˣ����������һ�ָ�Ч���Ż���ʩ��
 * ��̬�ڲ��෽ʽ��ռλ��ģʽ���ܴ���ͬ�������ƣ����Ҹ��������
 */
public class DoubleCheckLazySingleton {


    //�˴�Ҫ�� volatile �ؼ������� instance����֤ʵ�������������򵽸�ֵָ��֮��
    private static volatile DoubleCheckLazySingleton instance;

    // ˽���乹��
    private DoubleCheckLazySingleton(){}

    public static DoubleCheckLazySingleton getInstance(){
        //���û�м� volatile ���Σ����ʱ���һ�� if У������û��ͬ�������ܵ��� instance ���ò�Ϊ�գ����� instance ���ڲ�״̬���ܻ�û��ʼ�����
        if(instance == null){
            synchronized (DoubleCheckLazySingleton.class) {
                if (null == instance) {
                    //������� volatile ����instance��new DoubleCheclSingleton() ��ִ�п��ܻᱻ�����򵽸�ֵ���� instance = new DoubleCheclSingleton() ֮��
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }

}
