package Övning2;

import Övning2C.Övn2C;

public class Båt extends Fordon {
    double dödvikt;


    public Båt(int hastighet, int vikt, double dödvikt) {
        super(hastighet, vikt);
    }

    public double getDödvikt() {
        return dödvikt;
    }

    public void setDödvikt(double dödvikt) {
        this.dödvikt = dödvikt;
    }

    public void sväng() {
    }

    public void printMe() {
        System.out.println("Båtens hastighet: " + getHastighet() + "km/h, Båtens vikt: " + getVikt() + "kg, Båtens dödvikt: " + getDödvikt());
    }

    @Override
    public void hjulBuren() {

        System.out.println("Båten har 0 antal hjul");
    }

}

