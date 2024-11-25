package com.teachmeskills.hw.lesson_15.task3;

import com.teachmeskills.hw.lesson_15.task3.exception.InvalidLengthException;
import com.teachmeskills.hw.lesson_15.task3.util.NumberOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void showOperationResult() {
        System.out.print("Enter collection size: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String userInput = scanner.nextLine();

            if (!userInput.trim().isEmpty()) {
                int size = Integer.parseInt(userInput);
                if (size > 0) {
                    List<Integer> listInt = new ArrayList<>(size);

                    while (listInt.size() < size) {
                        listInt.add((int) (Math.random() * 100));
                    }
                    System.out.println(listInt);
                    NumberOperation.calculateArithmeticMean(listInt);
                } else {
                    throw new InvalidLengthException("Entered incorrect format. Please enter a positive integer.");
                }
            } else {
                throw new InvalidLengthException("Entered incorrect format. Please enter a positive integer.");
            }

        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }
    }
}
