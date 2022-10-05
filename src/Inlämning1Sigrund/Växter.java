package Inlämning1Sigrund;

public class Växter implements behöverFöda{
    protected double längd;
    protected String  namn;
    protected String typAvFöda;

    public Växter(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }
    public double getLängd() {
        return längd;
    }


    public String GetTypAvFöda() {
        return typAvFöda;
    }

    public String getNamn() {
        return namn;
    }
  public  String mängdFöda(){
        return "Välj typ av växt ";
  }
}






