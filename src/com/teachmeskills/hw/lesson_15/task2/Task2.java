package com.teachmeskills.hw.lesson_15.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void calculateAreaAndPerimeter() {

        List<Figure> figures = new ArrayList<>();
        figures.add(new Triangle(3, 2, 3));
        figures.add(new Rectangle(23, 54));
        figures.add(new Circle(55));
        figures.add(new Rectangle(12.4, 7.5));
        figures.add(new Triangle(5, 6, 7));

        for (Figure figure : figures) {
            System.out.println("Figure is: " + figure.figureName);
            System.out.println("Area: " + Math.round(figure.calculateArea()));
            System.out.println("Perimeter: " + Math.round(figure.calculatePerimeter()) + "\n");
        }
    }
}
