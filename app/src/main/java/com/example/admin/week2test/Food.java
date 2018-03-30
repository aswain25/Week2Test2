package com.example.admin.week2test;

/**
 * Created by Admin on 3/30/2018.
 */

public class Food {
    public enum FoodType
    {
        Meat,
        Fish,
        Bug,
        Grain,
    }

    FoodType foodtype;
    public Food(FoodType foodtype)
    {
        this.foodtype = foodtype;
    }

    public FoodType getFoodtype()
    {
        return foodtype;
    }
}
