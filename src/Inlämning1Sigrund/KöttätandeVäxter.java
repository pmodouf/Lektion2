package Inlämning1Sigrund;

public class KöttätandeVäxter extends Växter {
   private double basNivå;
   private double tillSkott;

    public KöttätandeVäxter(double längd, String namn) {
        super(längd,namn);
        basNivå = 0.1;
        tillSkott = 0.2;
        typAvFöda = "Proteindryck";
    }
    public String mängdFöda(){
        return "Den köttandeväxten " + namn + " behöver " + (basNivå + (0.2*längd)) + " liter" + typAvFöda + "per dag";
    }
}
