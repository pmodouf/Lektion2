package DavidLektioner;

public class Person {
    public Person(String namn, String adress, int alder) {
        this.namn = namn;
        this.adress = adress;
        this.alder = alder;
    }




    private
   String namn = "Danne";
    String adress = "HH";
    int alder =19;


    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
}


