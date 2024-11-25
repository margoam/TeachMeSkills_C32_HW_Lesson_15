package com.teachmeskills.hw.lesson_15.task3.util;

import java.util.List;

public class NumberOperation {

    public static void calculateArithmeticMean(List<Integer> list) {
        double result = 0;
        double sum = 0;
        for (int i : list) {
            sum += i;
            result = sum / list.size();
        }

        System.out.println("Result is: " + result);
    }
}
