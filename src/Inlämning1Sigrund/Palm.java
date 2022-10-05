package Inlämning1Sigrund;

public class Palm extends Växter  {
    public Palm(double längd, String namn) {
        super(längd, namn);
       typAvFöda = "Vatten";
    }
    public String mängdFöda() {

        return "Palmen " + namn + " behöver " + (längd * 0.5) + " liter " + typAvFöda + " per dag.";
}
}







