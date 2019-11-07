package com.lv3.cc.cache;

import com.lv3.cc.item.Animal;
import com.lv3.cc.item.impl.Dog;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class AnimalCache {

    private static Map<Integer, Animal> animalMap = new HashMap<Integer, Animal>();

    public static Animal getAnimal(Integer type) {
        return (Animal) animalMap.get(type).clone();
    }

    public static void loadCache() {
        Animal dog = new Dog();
        dog.setType(1);
        animalMap.put(dog.getType(), dog);
    }

}
