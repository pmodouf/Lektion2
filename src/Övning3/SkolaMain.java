package Övning3;

import java.util.ArrayList;

public class SkolaMain {
    public static void main(String[] args) {
        Student studen1 = new Student("Pa",19,"Matematik","Hanna");
        Kurs matematik = new Kurs(2,200,10);
        Kurs fysik = new Kurs(1,50,20);
        Lärare hanna = new Lärare("Hanna",40);

        ArrayList<Kurs> kurser = new ArrayList<>();
        kurser.add(matematik);
        kurser.add(fysik);

        
    }
}
