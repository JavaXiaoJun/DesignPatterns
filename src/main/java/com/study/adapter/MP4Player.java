package com.study.adapter;

/**
 * Created by lf52 on 2018/7/31.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playRmvb(String fileName) {
        System.out.println("Playing rmvb file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
