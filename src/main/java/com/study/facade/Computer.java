package com.study.facade;

/**
 * Created by lf52 on 2018/8/1.
 *
 * 电脑整机是 CPU、内存、硬盘的外观。有了外观以后，启动电脑和关闭电脑都简化了
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    /**
     * 在 new 电脑的同时把 cpu、内存、硬盘都初始化好并且接好线。
     */
    public Computer(){
        cpu =new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    /**
     * 外观方法一：开机（启动CPU、启动内存、启动硬盘）
     */
    public void startComputer(){
        System.out.println("computer is starting ...");
        cpu.init();
        memory.init();
        disk.init();
        System.out.println("computer started ...");
    }

    /**
     * 外观方法二：关机（关闭CPU、关闭内存、关闭硬盘）
     */
    public void closeComputer(){
        System.out.println("computer is stopping ...");
        cpu.destroy();
        memory.destroy();
        disk.destroy();
        System.out.println("computer stopped ...");
    }

}
