import javax.swing.*;

public class teast {
    public static void main(String[] args) {

        String InputMinut = JOptionPane.showInputDialog("Hur många minuter ringer du per månad");
        String InputKostnad = JOptionPane.showInputDialog("Hur mycket är din kostnad per minut ");
        double minuter = Double.parseDouble(InputMinut);
        double kostnad = Double.parseDouble(InputKostnad);

        double manadspris = minuter * kostnad;
        if (manadspris >= 1000){
            JOptionPane.showMessageDialog(null,"du får rabatt på 10%");
             manadspris = manadspris * 0.9;
            JOptionPane.showMessageDialog(null,"ditt nya månads pris blir"+manadspris);
            ;
        } else {
                JOptionPane.showMessageDialog(null,"du får tyvärr ingen rabatt");

            }

        }


    }

