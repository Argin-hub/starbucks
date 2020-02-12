package com.ucheba_one.personal;
import com.ucheba_one.cofee_area.Coffee;
import com.ucheba_one.cofee_area.CoffeeType;
import com.ucheba_one.cofee_area.FabrikaCoffee;

import java.util.Scanner;

import java.util.Scanner;

public class Barista {
    Scanner vvodVyboraClienta = new Scanner(System.in);
    FabrikaCoffee zakazClienta = new FabrikaCoffee();

    public void privetstvie () {
        System.out.println("Dobrii den'! Gotovy sdelat' zakaz?");
    }

    public void priemZakaza (){
        System.out.println("Kakoi cofe budete?");
        int vyborCofe = vvodVyboraClienta.nextInt();
        switch (vyborCofe){
            case (1):
                Coffee americano = zakazClienta.sozdaemCoffee(CoffeeType.AMERICANO);
                americano.opisanie();
                americano.cenaZaCoffee();
                break;
            case (2):  Coffee capuchino = zakazClienta.sozdaemCoffee(CoffeeType.CAPUCHINO);
                capuchino.opisanie();
                capuchino.cenaZaCoffee();
                break;
            case (3): Coffee latte = zakazClienta.sozdaemCoffee(CoffeeType.LATTE);
                latte.opisanie();
                latte.cenaZaCoffee();
                break;
            case (4): Coffee putover = zakazClienta.sozdaemCoffee(CoffeeType.PUTOVER);
                putover.opisanie();
                putover.cenaZaCoffee();
                break;
            case (5): Coffee clover = zakazClienta.sozdaemCoffee(CoffeeType.CLOVER);
                clover.opisanie();
                clover.cenaZaCoffee();
                break;
            default: System.out.println("Takogo cofe u nas net ");
        }
    }

    public void uhodClienta(){
        System.out.println("Prihodite eshe!");
    }
}
