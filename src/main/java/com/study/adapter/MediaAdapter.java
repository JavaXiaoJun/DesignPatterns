package com.study.adapter;

/**
 * Created by lf52 on 2018/7/31.
 *
 * 适配器类，使用 AdvancedMediaPlayer 对象来播放所需的格式
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type){
        if(type.equalsIgnoreCase("rmvb")){
            advancedMediaPlayer = new RmvbPlayer();
        }else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new MP4Player();
        }

    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("rmvb")){
            advancedMediaPlayer.playRmvb(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }

}
