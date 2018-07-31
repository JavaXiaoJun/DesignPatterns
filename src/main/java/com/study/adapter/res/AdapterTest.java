package com.study.adapter.res;

import com.study.adapter.AudioPlayer;

/**
 * Created by lf52 on 2018/7/31.
 */
public class AdapterTest {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("rmvb", "far far away.rmvb");
        audioPlayer.play("avi", "mind me.avi");
    }

}
