package HederligeHarry;

public class MotorCykelAnnons extends FordonsAnnons{
    int motorVolym;
    String drivTyp;

    public MotorCykelAnnons(double pris, String rubrik, String beskrivning, int årsModell, double antalMil, String modell, int motorVolym, String drivTyp) {
        super(pris, rubrik, beskrivning, årsModell, antalMil, modell);
        this.motorVolym = motorVolym;
        this.drivTyp = drivTyp;
    }


    @Override
    public String getAnnonsText() {
        System.out.println(rubrik+ "Välkommen att ta en titt på våran exklusiva, ");

        return null;
    }
}

