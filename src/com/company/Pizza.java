package com.company;

// 2 Создание комплексного класса.
//2.1 Создать класс Pizza. Описать поля:
//basis – поле типа Circle
//composition – состав пиццы
//name – название пиццы
//cost – цена.
//2.2 Создать конструктор, который принимает в качестве параметров имя, состав, цену и
//диаметр пиццы. Внутри конструктора создать объект класса Circle применив диаметр.

/**
Класс Pizza
 */

public class Pizza {
    Circle basis;
    private String composition;
    private String name;
    private double cost;


    public Pizza(String composition, String name, double cost, int diameter) {
        this.composition = composition;
        this.name = name;
        this.cost = cost;
        this.basis = new Circle(diameter/2);
          }

    @Override
    public String toString() {
        return "Название пиццы: " + name + " Состав пиццы: " + composition + " Стоимость пиццы: " + cost + "\n";
    }
    }

