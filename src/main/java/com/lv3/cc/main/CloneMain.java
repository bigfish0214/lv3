package com.lv3.cc.main;

import com.lv3.cc.cache.AnimalCache;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class CloneMain {
    public static void main(String[] args) {
        AnimalCache.loadCache();
        System.out.println(AnimalCache.getAnimal(1));
        System.out.println(AnimalCache.getAnimal(1));
        System.out.println(AnimalCache.getAnimal(1));
    }
}
