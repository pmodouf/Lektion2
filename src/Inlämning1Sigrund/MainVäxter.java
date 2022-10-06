package Inlämning1Sigrund;

import javax.swing.*;
import java.util.ArrayList;

public class MainVäxter {
    public static void main(String[] args) {
        Växter palm = new Palm(5, "Laura");


        Växter palm2 = new Palm(1, "Putte");

        Växter kaktus = new Kaktus(0.2, "Igge");
        Växter kött = new KöttätandeVäxter(0.7, "Meatloaf");

        ArrayList<Växter> minaVäxter = new ArrayList<>();
        minaVäxter.add(palm);
        minaVäxter.add(palm2);
        minaVäxter.add(kaktus);
        minaVäxter.add(kött);
        boolean on = true;
        while (on) {
            String outPutMessage = "Välj vilken växt du vill mata, välj en siffra från 1 till " + minaVäxter.size() + "\n";
            for (int i = 0; i < minaVäxter.size(); i++) {
                outPutMessage += (i + 1) + "." + minaVäxter.get(i).getNamn() + "\n";
                }

            String answer = JOptionPane.showInputDialog(outPutMessage);
            if (answer.matches("[0-9]+")) {
                int intAnswer = Integer.parseInt(answer);
                if (intAnswer <= minaVäxter.size() && intAnswer > 0) {
                    //polymorfismen sker här
                    JOptionPane.showMessageDialog(null, minaVäxter.get(intAnswer - 1).mängdFöda());
                } else {
                    JOptionPane.showMessageDialog(null, "skriv en siffra mellan 1-" + minaVäxter.size());
                }
            } else {
                JOptionPane.showMessageDialog(null, "skriv en siffra mellan 1-" + minaVäxter.size());
            }

        }
    }
}
