package com.lv3.cc.Builder;

import com.lv3.cc.item.impl.*;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.add(new VegBurger());
        meal.add(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.add(new ChickenBurger());
        meal.add(new Coke());
        return meal;
    }
}
