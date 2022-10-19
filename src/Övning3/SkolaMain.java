package Övning3;

import java.util.ArrayList;

public class SkolaMain {
    public static void main(String[] args) {
        Student student1 = new Student("Pa",19,"Matematik","David");
        Kurs matematik = new Kurs(2,200,10);
        Kurs fysik = new Kurs(1,50,20);
        Lärare hanna = new Lärare("Hanna",40);
        Kurs anatomi = new Kurs(3,300,15);

        ArrayList<Kurs> kurser = new ArrayList<>();
        kurser.add(matematik);
        kurser.add(fysik);
        kurser.add(anatomi);
        for(int i =0; i<kurser.size();i++);

        Lärare lärare = new Lärare("Davide",34);





        
    }
}
