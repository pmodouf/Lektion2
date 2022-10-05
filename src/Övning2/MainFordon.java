package Övning2;

import java.util.ArrayList;
import java.util.List;

public class MainFordon {

    //MainFordon övn2 = new MainFordon();
    public void printFordon(Fordon fordon) {
    fordon.printMe();
}
public MainFordon() {
    Tåg tåg = new Tåg(200, 500000, 6);
    Bilen bil = new Bilen(110, 1000, 70);
    Båt båt = new Båt(70,800000,300000);
    Cykel cykel = new Cykel(40,25, 13);

    Fordon f = new Cykel(50, 35, 14);

    printFordon(tåg);
    printFordon(bil);
    printFordon(båt);
    printFordon(cykel);

    printFordon(f);

    System.out.println();
    List<Fordon> lista = new ArrayList<>();
    lista.add(tåg);
    lista.add(båt);
    lista.add(cykel);
    lista.add(bil);
    lista.add(f);

    for (Fordon fordon : lista) {
        fordon.printMe();
    } }
    public static void main(String[] args){
        MainFordon övn = new MainFordon();


    }


}






