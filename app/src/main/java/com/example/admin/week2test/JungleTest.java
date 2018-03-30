package com.example.admin.week2test;

/**
 * Created by Admin on 3/30/2018.
 */

public class JungleTest {
    public static void main(String[] args)
    {
        Jungle jungle = new Jungle();

        jungle.animals.add(new Monkey());
        jungle.animals.add(new Monkey());
        jungle.animals.add(new Monkey());
        jungle.animals.add(new Tiger());
        jungle.animals.add(new Tiger());
        jungle.animals.add(new Snake());
        jungle.animals.add(new Snake());
        jungle.animals.add(new Snake());
        jungle.animals.add(new Snake());

        //all eat
        for (Animal animal : jungle.animals)
            animal.eatFood(new Food(Food.FoodType.Grain));
        //all eat
        for (Animal animal : jungle.animals)
            animal.eatFood(new Food(Food.FoodType.Meat));
        //playables play
        for (Animal animal : jungle.animals)
            if (animal instanceof Playable)
                ((Playable)animal).play();
        //all eat
        for (Animal animal : jungle.animals)
            animal.eatFood(new Food(Food.FoodType.Meat));
        //all sleep
        for (Animal animal : jungle.animals)
            animal.sleep();
        //playables play
        for (Animal animal : jungle.animals)
            if (animal instanceof Playable)
                ((Playable)animal).play();

        jungle.soundOff();
    }
}
