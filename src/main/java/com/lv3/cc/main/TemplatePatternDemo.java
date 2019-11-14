package com.lv3.cc.main;

import com.lv3.cc.template.Clicket;
import com.lv3.cc.template.Football;
import com.lv3.cc.template.Game;

/**
 * @author lvhao
 * @date 2019-11-14
 * @description
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Clicket();
        game.play();
        game = new Football();
        game.play();
    }
}
