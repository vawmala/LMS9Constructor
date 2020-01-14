package com.company;

/**
Создание объектов Circle
 */

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        System.out.println();

        Circle circle1 = new Circle(5, "Yellow");
        System.out.println(circle1.getColour());
        System.out.println(circle1.getRadius());
    }
}
