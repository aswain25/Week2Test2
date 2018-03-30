package com.example.admin.week2test;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Admin on 3/30/2018.
 */

public class Jungle {
    List<Animal> animals = new ArrayList<Animal>();

    public Jungle(){}

    public void soundOff()
    {
        for (Animal animal : animals)
        {
            animal.makeSound();
            animal.reportEnergyLevel();
        }
    }
}
