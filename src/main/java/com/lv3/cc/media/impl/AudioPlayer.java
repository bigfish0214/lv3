package com.lv3.cc.media.impl;

import com.lv3.cc.media.MediaPlayer;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")) {
            System.out.println("play mp3 file : " + fileName);
        } else if(audioType.equals("mp4") || audioType.equals("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("invalid media audioType : " + audioType);
        }
    }
}
