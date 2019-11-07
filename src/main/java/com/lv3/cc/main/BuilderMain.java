package com.lv3.cc.main;

import com.lv3.cc.Builder.MealBuilder;
import com.lv3.cc.item.impl.Meal;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class BuilderMain {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());

        Meal chickenMeal = mealBuilder.prepareNonVegMeal();
        chickenMeal.showItems();
        System.out.println(chickenMeal.getCost());
    }
}
