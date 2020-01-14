package com.company;

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


