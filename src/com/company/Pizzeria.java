package com.company;

//2.3 Создать класс Pizzeria c методом main в котором создать массив из разных пицц.
//2.4 Вывести в цикле информацию о каждой пицце.
//2.5 Написать JavaDoc для всех классов

/**
 Создание объекта класса Pizza с разными характеристиками
  */

public class Pizzeria {
    public static void main(String[] args) {
        Pizza [] pizzas = new Pizza[3];
        pizzas[0] = new Pizza("Свинина,огурец,сыр,зелень","Мясная",55.25,12);
        pizzas[1] = new Pizza("Рыба,помидор,сыр,зелень","Лосось",60,12);
        pizzas[2] = new Pizza("Курица,ананас,зелень","Куринная",57,12);

        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }


        }

    }


