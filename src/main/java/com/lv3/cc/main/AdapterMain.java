package com.lv3.cc.main;

import com.lv3.cc.media.MediaPlayer;
import com.lv3.cc.media.impl.AudioPlayer;
import com.lv3.cc.media.impl.MediaAdapter;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class AdapterMain {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "mp3");
        audioPlayer.play("mp4", "mp4");
        audioPlayer.play("vlc", "vlc");
        audioPlayer.play("mp5", "mp5");
    }


}
