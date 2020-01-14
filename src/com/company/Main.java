package com.company;

// 1.3 Создать метод main, в котором создать экземпляр класса Circle. Вывести на экран
//сообщение с данными о длинне окружности, площади и цвета.

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
