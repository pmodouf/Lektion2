package Inlämning1Sigrund;

public class Palm extends Växter  {
    public Palm(double längd, String namn) {
        super(längd, namn);
       typAvFöda = "Vatten";
    }
    public String mängdFöda() { // här sker polymorfismen med min getLängd och getNamn.

        return "Palmen " + getNamn() + " behöver " + (getLängd() * 0.5) + " liter " + typAvFöda + " per dag.";
}
}







