package Övning2;

import Övning2C.Övn2C;

public class Tåg extends Fordon {
    int antalVagnar;


    public Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
    }

    public void kopplaVagn() {
    }

    public int getAntalVagnar() {
        return antalVagnar;
    }

    public void setAntalVagnar(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }

    @Override
    public void printMe() {

    }

    public void hjulBuren() {
        System.out.println("Tåget har 0 antal hjul");
    }
}



