package com.study.adapter;

/**
 * Created by lf52 on 2018/7/31.
 *
 * 更高级媒体播放器接口：可以播放rmvb mp4
 */
public interface AdvancedMediaPlayer {

    public void playRmvb(String fileName);

    public void playMp4(String fileName);
}
