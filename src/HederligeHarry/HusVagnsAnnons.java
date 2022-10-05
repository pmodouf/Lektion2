package HederligeHarry;

public class HusVagnsAnnons extends FordonsAnnons{
    String dusch;
    int antalBäddar;
    String modell,färg;


    public HusVagnsAnnons(double pris, String rubrik, String beskrivning, int årsModell,
                          double antalMil, String modell, String dusch, int antalBäddar) {
        super(pris, rubrik, beskrivning, årsModell, antalMil, modell);
        this.dusch = dusch;
        this.antalBäddar = antalBäddar;



    } public String getAnnonsText(){
        System.out.println(rubrik+"Välkommen att ta en titt på våran rymliga husvagn av modell"+ modell + " i"+färg +
                ". Du får den för ynka " + pris +"kr." + "Den har åkt ca "+ antalMil+"så den är i bra skick."
                + "Årsmodellen är " +årsModell+ ". Här får du en kort beskrivning av bilen. "+ beskrivning);
        return null;
    }
}
