package com.lv3.cc.media.impl;

import com.lv3.cc.media.AdvancedMediaPlayer;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("play mp4 file : " + fileName);
    }
}
