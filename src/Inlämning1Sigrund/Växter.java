package Inlämning1Sigrund;

public class Växter implements behöverFöda{ //här implementerar jag från min interface
    private double längd;
    private String  namn;
    public String typAvFöda;

    public Växter(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }  // här sker inkapsling eftersom att de bara kan nås genom metoden.
    public double getLängd() {
        return längd;
    }


    public String getTypAvFöda() {
        return typAvFöda;
    }

    public String getNamn() {
        return namn;
    } // här sker inkapsling
  public  String mängdFöda(){
        return "Välj typ av växt ";
  }
}






