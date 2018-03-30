package com.example.admin.week2test;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Admin on 3/30/2018.
 */

public abstract class Animal {
    public int energyLevel;

    public abstract int getSpeciesLeft();

    public void makeSound()
    {
        energyLevel -= 3;
        System.out.println("(" + getClass().getSimpleName() +  " cries)");
    }
    public void eatFood(Food food)
    {
        System.out.println("(" + getClass().getSimpleName() +  " eats)");
        energyLevel +=5;
    }
    public void sleep()
    {
        System.out.println("(" + getClass().getSimpleName() +  " sleeps)");
        energyLevel +=10;
    }
    public int reportEnergyLevel()
    {
        System.out.println("(" + getClass().getSimpleName() +  " energy level is + " + String.valueOf(energyLevel) + ")");
        return energyLevel;
    }
}
