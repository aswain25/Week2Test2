package com.example.admin.week2test;

/**
 * Created by Admin on 3/30/2018.
 */

public class Snake extends Animal {

    @Override
    public int getSpeciesLeft() {
        return memberCount;
    }

    private static int memberCount = 0;

    public Snake()
    {
        memberCount++;
    }
}
