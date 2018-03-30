package com.example.admin.week2test;

/**
 * Created by Admin on 3/30/2018.
 */

public class Monkey extends Animal implements Playable {


    @Override
    public int getSpeciesLeft() {
        return memberCount;
    }
    private static int memberCount = 0;

    public Monkey()
    {
        memberCount++;
    }


    @Override
    public void eatFood(Food food)
    {
        System.out.println("(Monkey eats)");
        energyLevel +=2;
    }

    @Override
    public void makeSound()
    {
        System.out.println("(Monkey cries)");
        energyLevel -= 4;
    }

    @Override
    public void play() {
        if (energyLevel >= 8)
        {
            System.out.println("(Monkey plays): Oooo Oooo Oooo");
            energyLevel -= 8;
        }
        else
            System.out.println("(Monkey is too tired to play)");
    }
}
