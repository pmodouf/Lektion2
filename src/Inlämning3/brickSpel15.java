package Inlämning3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class brickSpel15 extends JFrame implements ActionListener {
    ArrayList<JButton> lista = new ArrayList<>();


    brickSpel15() {
        JButton newGame = new JButton("NEW GAME");
        setLayout(new GridLayout(5, 17));
        setSize(550, 500);
        for (int i = 1; i <= 16; i++) {
            JButton knapp = new JButton(String.valueOf(i));
            knapp.setSize(50, 50);
            add(knapp);
            lista.add(knapp);
            if (i == 16) {
                knapp.setText(" ");
            }
            knapp.addActionListener(this);
        }
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(newGame);
        newGame.addActionListener(this);


    }

/*
byter plats på knapp 1 och knapp 2. byter text på dom
 */

    public void changePlaces(JButton knapp1, JButton knapp2) {
        String tempText = knapp1.getText();
        knapp1.setText(knapp2.getText());
        knapp2.setText(tempText);
    }
    /*
    går igenom hela arrayen för att hitta positionen den tomma rutan har i arrayen
     */

    public static int findSpace(ArrayList<JButton> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().equals(" ")) {
                return i;
            }

        }

        return -1;
    }
    public int findButton(JButton clickedButton) {
        return lista.indexOf(clickedButton);

    }


    public static void main(String[] args) {
        new brickSpel15();
    }

    public JButton recentClick = new JButton();

    /*
    int space för mellanslaget i listan. current hittar vilken positon i listan den man klickat på har.
    clickedButton e visar vilket objekt man klickat på. och gör den till en jbutton.
    kontrollerar om dom har vunnit boolean.

    när dom klickar på newButton blir det en forloop som resettar knapparna först till originalvärdet
    och sen till random. i första knappen den är i i listan och random
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        int space = findSpace(lista);
        JButton clickedButton = (JButton) e.getSource();
        int current = findButton(clickedButton);
        boolean hasWon = true;
        if (clickedButton.getText().equals("NEW GAME")) {
            for (int k = 0; k < lista.size(); k++) {
                lista.get(k).setText(String.valueOf(k + 1));
                if (k == 15) {
                    lista.get(k).setText(" ");
                }
            }
            Random random = new Random();
            for (int i = 0; i < lista.size(); i++) {
                changePlaces(lista.get(i), lista.get(random.nextInt(16)));

            }
            hasWon = false;

        }
        /*här kontrollerar vi vad dom har klickat på. om current är 3,7 eller 11 eller om
        current är 4, 8 eller 12 då ska dom inte byta plats med vänstra eller högra.
        kollar i arrayen -1,+4,-4 om den man klickat på finns bredvid space så att den kan flyttas
        bredvid ovanför eller under

            */
        if (current == 3 || current == 7 || current == 11) {
            if (current - 1 == space || current + 4 == space || current - 4 == space) {
                changePlaces(lista.get(space), lista.get(current));
            }
        } else if (current == 4 || current == 8 || current == 12) {
            if (current + 1 == space || current + 4 == space || current - 4 == space) {
                changePlaces(lista.get(space), lista.get(current));
            }
        } else {
            if (current - 1 == space || current + 1 == space || current + 4 == space || current - 4 == space) {
                changePlaces(lista.get(space), lista.get(current));
            }


        }
        /*
        här kollar vi om dom har vunnit. vi kollar om den som är sista positionen är space.
        tar minus ett för jag vet att den sista positionen måste vara space.
        1-15 space sista rutan.
         */

        if (lista.get(15).getText().equals(" ")) {
            for (int i = 0; i < lista.size() - 1; i++) {
                if (Integer.parseInt(lista.get(i).getText()) != i + 1) {
                    hasWon = false;
                }
            }

        } else {
            hasWon = false;
        }
        /*
        vi har kollat om dom vinner om dom vunnit har vi lagt så att rutorna skriver in
        du vann.

         */
        if (hasWon) {
            String vann = "DU  VANN";
            for (int j = 0; j < vann.length(); j++) {
                lista.get(j).setText(String.valueOf(vann.charAt(j)));

            }


        }
    }



}

