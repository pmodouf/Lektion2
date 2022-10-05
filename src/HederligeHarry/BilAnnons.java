package HederligeHarry;

public class BilAnnons extends FordonsAnnons {
    String färg;
    boolean sommarDäck;
    boolean vinterDäck;


    public BilAnnons(double pris, String rubrik, String beskrivning, int årsModell, double antalMil, String modell, String färg,
                     String sommarDäck, String vinterDäck) {
        super(pris, rubrik, beskrivning, årsModell, antalMil, modell);
        this.färg = färg;
        this.sommarDäck = Boolean.parseBoolean(sommarDäck);
        this.vinterDäck = Boolean.parseBoolean(vinterDäck);

    }

    @Override
    public String getAnnonsText() {
        System.out.println(rubrik + "\n" + "Välkommen, ta en titt på våran exklusiva" + modell + ". Den är väldigt komfortabel och kommer i" +
                färg + "färg. Den har åkt" + antalMil + "mil och årsmodellen är" + årsModell + ". En väldigt prisvärd bil, för endast"
                + pris + ". Här kommer en kort beskrivning av bilen: " + beskrivning);

        return null;

    }
}










