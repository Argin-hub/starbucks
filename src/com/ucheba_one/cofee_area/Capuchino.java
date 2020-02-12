package com.ucheba_one.cofee_area;

public class Capuchino extends Coffee{

    @Override
    public void cenaZaCoffee() {
        System.out.println("Цена 1400"+MONEY);
    }

    @Override
    public void opisanie() {
        System.out.println("Vy poluchite naivkusneishii Capuchino!");
    }
}
