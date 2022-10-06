package Inlämning1Sigrund;

public class Kaktus extends Växter  {
    public Kaktus(double längd, String namn) {
        super(längd,namn);
        typAvFöda = "Mineralvatten";

    }

    public String mängdFöda(){

        return "Kaktusen " + getNamn() + " behöver 0.2 liter " +typAvFöda + "per dag";
    }
}
