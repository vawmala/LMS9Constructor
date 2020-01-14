package com.company;

// 1 Создание класса с конструктором
//1.1 Создать класс Circle. Описать поля: радиус длинна окружности, площадь, цвет.
//Создать 2 конструктора, в которые передавать параметры: радиус, и цвет и радиус.
//1.2 Параметры площадь и длинна окружности расcчитать в конструкторе на основе
//радиуса и Pi. Примечание число PI можно взять из класса Math, Math.PI.

/**
Класс Circle
 */

public class Circle {
    private int radius;
    private double length;
    private double square;
    private String colour;

    public Circle(int radius) {
        this.radius = radius;
        this.square = this.radius * this.radius * Math.PI;
        System.out.println("Площадь данной окружности  равна: = " + square);
        this.length = 2 * this.radius * Math.PI;
        System.out.println("Длина данной окружности равна: = " + length);
    }

    public Circle(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
