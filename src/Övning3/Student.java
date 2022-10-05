package Övning3;

public class Student extends Person {

    String kurs;
    String lärare;

    public String getKurs() {
        return kurs;
    }

    public String getLärare() {
        return lärare;
    }

    public Student(String namn, int ålder, String kurs, String lärare) {
        super(namn, ålder);
        this.kurs = kurs;
        this.lärare = lärare;

    }
}

