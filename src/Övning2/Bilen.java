package Övning2;

import Övning2C.Övn2C;

public class Bilen extends Fordon {
    int antalVaxlar;
    int vaxelJustNu;

    double motorEffekt;
    String modell;

    public void växla() {
    }

    public Bilen(int hastighet, int vikt, double motorEffekt) {
        super(hastighet, vikt);

    }

    public String modell() {
        return modell;
    }

    public int getAntalVaxlar() {
        return antalVaxlar;
    }

    public void setAntalVaxlar(int antalVaxlar) {
        this.antalVaxlar = antalVaxlar;
    }

    public int getVaxelJustNu() {
        return vaxelJustNu;
    }

    public void setVaxelJustNu(int vaxelJustNu) {
        this.vaxelJustNu = vaxelJustNu;
    }

    public double getMotorEffekt() {
        return motorEffekt;
    }

    public void setMotorEffekt(double motorEffekt) {
        this.motorEffekt = motorEffekt;
    }

    public void printMe() {
        System.out.println("Bilens hastighet " + getHastighet() + "km/h" + "Bilens vikt: " + getVikt() + "kg och motoreffekten är: " + getMotorEffekt());
    }

    public void hjulBuren() {
        System.out.println("Bilen har 4 antal hjul");
    }

}
