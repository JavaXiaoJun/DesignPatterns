package com.study.adapter;

/**
 * Created by lf52 on 2018/7/31.
 */
public class RmvbPlayer implements AdvancedMediaPlayer {
    @Override
    public void playRmvb(String fileName) {
        System.out.println("Playing rmvb file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
