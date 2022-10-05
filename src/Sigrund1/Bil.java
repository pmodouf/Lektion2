package Sigrund1;

public class Bil{
    String reg;
    String modell;
    String marke;

    Owner owner;

    public Bil(String reg, String modell, String marke, Owner owner) {
        this.reg = reg;
        this.modell = modell;
        this.marke = marke;
        this.owner = owner;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    void såld(Owner owner) {
        this.owner = owner;
    }

}



