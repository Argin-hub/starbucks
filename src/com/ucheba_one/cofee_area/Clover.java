package com.ucheba_one.cofee_area;

public class Clover extends Coffee {

    @Override
    public void cenaZaCoffee() {
        System.out.println("Цена 1000"+MONEY);
    }

    @Override
    public void opisanie() {
        System.out.println("Clover eto vesh'!");
    }
}
