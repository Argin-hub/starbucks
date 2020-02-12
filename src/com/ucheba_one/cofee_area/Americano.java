package com.ucheba_one.cofee_area;

public class Americano extends Coffee {

    @Override
    public void opisanie() {
        System.out.println("Vy poluchite naivkusneishii Americano!");
    }

    @Override
    public void cenaZaCoffee() {
        System.out.println("Цена 1200 "+ MONEY);
    }
}
