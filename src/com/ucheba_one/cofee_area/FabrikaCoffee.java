package com.ucheba_one.cofee_area;

public class FabrikaCoffee {

    public Coffee sozdaemCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO: coffee = new Americano();
                break;
            case CAPUCHINO:   coffee = new Capuchino();
                break;
            case CLOVER: coffee = new Clover();
                break;
            case LATTE: coffee = new Latte();
                break;
            case PUTOVER: coffee = new PutOver();
                break;
            default: System.out.println("Takogo cofe u nas net");
                break;
        }
        return coffee;
    }
}
