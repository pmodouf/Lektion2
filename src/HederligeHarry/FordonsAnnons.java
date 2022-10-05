package HederligeHarry;

public class FordonsAnnons {
    double pris;
    String rubrik, beskrivning;
    int årsModell;
    double antalMil;

    String modell;


    public double getPris() {
        return pris;
    }
    public String getRubrik() {
        return rubrik;
    }
    public String getBeskrivning() {
        return beskrivning;
    }
    public int getÅrsModell() {
        return årsModell;
    }
    public double getAntalMil() {
        return antalMil;
    }
    public String getModell(){return modell;}

    public FordonsAnnons(double pris, String rubrik, String beskrivning, int årsModell, double antalMil, String modell) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.årsModell = årsModell;
        this.antalMil = antalMil;
        this.modell = modell;


    } public String getAnnonsText(){



        return null;
    }
}