package Övning3;

public abstract class Person {

        String namn;
        int ålder;

    public String getNamn() {
        return namn;
    }

    public int getÅlder() {
        return ålder;
    }

    public Person(String namn, int ålder) {
        this.namn = namn;
        this.ålder = ålder;
    }
}
