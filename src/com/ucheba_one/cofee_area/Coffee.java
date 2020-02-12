package com.ucheba_one.cofee_area;

public abstract class Coffee {

    public static final String MONEY = "tenge";

    public abstract void opisanie();

    public void cenaZaCoffee (){
    }

    public void grindCoffee(){
        System.out.println("Перемалываем кофе по технологии");
    }
    public void makeCoffee(){
        System.out.println("завариваем кофе, учитывая консистенцию'");
    }
    public void pourIntoCup(){
        System.out.println("Разливаем по чашкам");
    }
}
