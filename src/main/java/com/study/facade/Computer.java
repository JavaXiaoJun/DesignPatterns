package com.study.facade;

/**
 * Created by lf52 on 2018/8/1.
 *
 * ���������� CPU���ڴ桢Ӳ�̵���ۡ���������Ժ��������Ժ͹رյ��Զ�����
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    /**
     * �� new ���Ե�ͬʱ�� cpu���ڴ桢Ӳ�̶���ʼ���ò��ҽӺ��ߡ�
     */
    public Computer(){
        cpu =new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    /**
     * ��۷���һ������������CPU�������ڴ桢����Ӳ�̣�
     */
    public void startComputer(){
        System.out.println("computer is starting ...");
        cpu.init();
        memory.init();
        disk.init();
        System.out.println("computer started ...");
    }

    /**
     * ��۷��������ػ����ر�CPU���ر��ڴ桢�ر�Ӳ�̣�
     */
    public void closeComputer(){
        System.out.println("computer is stopping ...");
        cpu.destroy();
        memory.destroy();
        disk.destroy();
        System.out.println("computer stopped ...");
    }

}
