package com.differ;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Integers numbersStream = new Integers(new ArrayList<>(List.of(1, 2, 13, 4, 15, 6, 17, 8, 19)));
        System.out.println(numbersStream.getMaxStream());
        System.out.println(numbersStream.getMaxLoop());
        System.out.println(numbersStream.getMinStream());
        System.out.println(numbersStream.getMinLoop());
        System.out.println(numbersStream.getSumStream());
        System.out.println(numbersStream.getSumLoop());
        System.out.println(numbersStream.getAverageStream());
        System.out.println(numbersStream.getAverageLoop());
        numbersStream.getMaxMinSumAverageStream();

        Strings stringsStream = new Strings(new ArrayList<>(List.of("Java", "", "Is", "", "Cool")));
        System.out.println(stringsStream.getCountEmptyStringStream());
        System.out.println(stringsStream.getCountEmptyStringLoop());
        System.out.println(stringsStream.deleteEmptyStringsStream());
        System.out.println(stringsStream.deleteEmptyStringsLoop());
        System.out.println(stringsStream.getMergedStringStream());
        System.out.println(stringsStream.getMergedStringLoop());
    }

}