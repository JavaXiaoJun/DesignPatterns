package com.study.adapter;

/**
 * Created by lf52 on 2018/7/31.
 */
public class AudioPlayer implements MediaPlayer{

    private MediaAdapter adapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("rmvb")){
            adapter = new MediaAdapter(audioType);
            adapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
