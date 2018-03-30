package com.example.admin.week2test;

/**
 * Created by Admin on 3/30/2018.
 */

public class Tiger extends Animal {

    @Override
    public int getSpeciesLeft() {
        return memberCount;
    }

    private static int memberCount = 0;

    public Tiger()
    {
        memberCount++;
    }

    @Override
    public void sleep()
    {
        energyLevel += 5;
    }

    @Override
    public void eatFood(Food food)
    {
        if (food.foodtype == Food.FoodType.Grain)
            System.out.println("Tigers cannot eat grain");
        else
            super.eatFood(food);
    }
}
