package com.lv3.cc.media.impl;

import com.lv3.cc.media.AdvancedMediaPlayer;
import com.lv3.cc.media.MediaPlayer;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equals("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equals("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {
        if(audioType.equals("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equals("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
