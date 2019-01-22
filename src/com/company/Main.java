package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Write a Java program to create a new array list to hold colors.
        List<String> colors = new ArrayList<>();

//        Add at least 3 colors (string) to the array list and print out all its values.
        colors.add("red");
        colors.add("yellow");
        colors.add("green");

        for (String color : colors) {
            System.out.println(color);
        }

//        Using the array list created above, print out the value at index 1.
        System.out.println(colors.get(1));

//        Using the array list above, prompt the user for one new color, and add that color to the array list.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a new color: ");
        String color = keyboard.next();
        colors.add(color);

//      Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit.
//      Each time the user enters a color, add that to the array list. Print out the list at the end.
        while (true) {
            System.out.print("Enter a new color: ");
            color = keyboard.next().toLowerCase();
            if (color.equalsIgnoreCase("q")){
                break;
            } else {
                colors.add(color);
            }
        }
        
        System.out.println(colors);
    }
}