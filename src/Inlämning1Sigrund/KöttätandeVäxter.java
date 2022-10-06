package Inlämning1Sigrund;

public class KöttätandeVäxter extends Växter {
   public double basNivå;
   public double tillSkott;

    public KöttätandeVäxter(double längd, String namn) {
        super(längd,namn);
        basNivå = 0.1;
        tillSkott = 0.2;
        typAvFöda = "Proteindryck";
    }
    public String mängdFöda(){
        return "Den köttandeväxten " + getNamn() + " behöver " + (basNivå + (0.2*getLängd())) + " liter" + typAvFöda + "per dag";
    }
}
