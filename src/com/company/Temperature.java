package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Temperature {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Double> temperatureList = new ArrayList<>();
        temperatureList.add(40.5);
        temperatureList.add(33.9);
        temperatureList.add(37.8);
        temperatureList.add(15.3);
        temperatureList.add(25.6);

        //Sort
        Collections.sort(temperatureList);
        print(temperatureList);

        //Search
        int searchIndex = Collections.binarySearch(temperatureList, 39.8);

        if (searchIndex >= 0) {
            System.out.println("Temperature found." + searchIndex);
        } else {
            System.out.println("Temperature not found." + searchIndex);
        }

        //Shuffle
        Collections.shuffle(temperatureList);
        print(temperatureList);
    }

    public static void print(List<Double> temperatureList){
        //print
        System.out.println(temperatureList);

//        for (Double temp : temperatureList) {
//            System.out.print(temp + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < temperatureList.size(); i++) {
//            System.out.print(temperatureList.get(i) + " ");
//        }
//        System.out.println();
    }
}
