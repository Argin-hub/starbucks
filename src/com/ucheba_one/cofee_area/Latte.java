package com.ucheba_one.cofee_area;

public class Latte extends Coffee{

    @Override
    public void cenaZaCoffee() {
        System.out.println("Цена 1500"+MONEY);
    }

    @Override
    public void opisanie() {
        System.out.println("Vy poluchite shikarnii Latte!");
    }
}
