package com.example.admin.week2test;

import android.util.Log;

import java.util.Arrays;
import java.util.Dictionary;

/**
 * Created by Admin on 3/30/2018.
 */

public class EncodingSringPRoblem {
    public static void main(String[] args)
    {
        //problem 1 test
        System.out.println(f("acp"));

        //problem 2 test
        System.out.println(Arrays.toString(g("Hello there! Apple!")));
    }
    //problem one
    public static String f(String string)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++)
        {
            if (Character.isUpperCase(string.charAt(i)))
            {
                result.append((char)(90 - (string.charAt(i) - 65)));
            }
            else if (Character.isLowerCase(string.charAt(i)))
            {
                result.append((char)(122 - (string.charAt(i) - 97)));
            }
            else
            {
                result.append(string.charAt(i));
            }
        }
        return result.toString();
    }
    //problem 2
    public static int[] g(String string)
    {
        int[] result = new int[26];
        for (int i = 0; i < string.length(); i++)
        {
            if (Character.isUpperCase(string.charAt(i)))
            {
                result[string.charAt(i) - 65]++;
            }
            else if (Character.isLowerCase(string.charAt(i)))
            {
                result[string.charAt(i) - 97]++;
            }
        }
        return result;
    }
}
