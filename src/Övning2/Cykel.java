package Övning2;

import Övning2C.Övn2C;

public class Cykel extends Fordon {
    int antalVaxlar;
    int antalVaxlarJustNu;


    public Cykel(int hastighet, int vikt, int antalVaxlar) {
        super(hastighet, vikt);
    }

    public void växla() {
    }

    public int getAntalVaxlar() {
        return antalVaxlar;
    }

    public void setAntalVaxlar(int antalVaxlar) {
        this.antalVaxlar = antalVaxlar;
    }

    public int getAntalVaxlarJustNu() {
        return antalVaxlarJustNu;
    }

    public void setAntalVaxlarJustNu(int antalVaxlarJustNu) {
        this.antalVaxlarJustNu = antalVaxlarJustNu;
    }

    @Override
    public void printMe() {
        System.out.println("Cykelns hastighet: " + getHastighet() + "km/h, cykelns vikt :" + getVikt() + "kg");
    }

    public void hjulBuren() {
        System.out.println("Cykeln har 2 antal hjul");
    }
}

