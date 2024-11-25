package com.teachmeskills.hw.lesson_15.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public static void showEvenNumbersFromCollection() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        while (true) {
            System.out.print("Please enter an integer number or 'exit' to exit: ");
            String userInput = scanner.nextLine();

            if (userInput
                    .toLowerCase()
                    .trim()
                    .equals("exit")) {
                break;
            }
            try {
                int intNumber = Integer.parseInt(userInput);
                if (intNumber % 2 == 0) {
                    integerList.add(intNumber);
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect entered value. Please, try again.");
            }
        }

        if (!integerList.isEmpty()) {
            System.out.println("Even numbers: ");
            for (int number : integerList) {
                System.out.println(number);
            }
        } else {
            System.out.println("There are no any even numbers.");
        }
    }
}
