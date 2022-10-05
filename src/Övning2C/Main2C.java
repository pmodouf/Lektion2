package Övning2C;

import Övning2.Bilen;
import Övning2.Båt;
import Övning2.Cykel;
import Övning2.Tåg;

public class Main2C {
    public static void main(String[] args) {
        Bilen nyBil = new Bilen(200,2000,2);
        Båt nyBåt = new Båt(70,10000,30000);
        Cykel nyCykel= new Cykel(30,20,13);
        Tåg nyTåg = new Tåg(250,300000,6);


        nyBil.printMe();
        nyBåt.printMe();
       nyCykel.printMe();
       nyTåg.printMe();

       nyBil.hjulBuren();
       nyBåt.hjulBuren();
       nyCykel.hjulBuren();
       nyTåg.hjulBuren();


    }
}
