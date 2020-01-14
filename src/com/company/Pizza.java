package com.company;

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

