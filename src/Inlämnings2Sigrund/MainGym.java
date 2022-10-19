package Inlämnings2Sigrund;

import javax.swing.*;
import java.io.*;
import java.time.LocalDate;

public class MainGym {
    public static void main(String[] args) throws IOException {
        String nextLine = "";
        String fullFile = "";
        String fileInList;
        String[] list;
        try {
            BufferedReader file = new BufferedReader(new FileReader("C:\\test\\Lektion 2\\src\\Inlämnings2Sigrund\\BestGym.txt"));
            while ((nextLine = file.readLine()) != null) {
                fullFile += nextLine + "\n";
            }
            list = fullFile.split("\n");
            String answer = JOptionPane.showInputDialog("Skriv ett namn eller personnummer: ");
            int memberPos = findMember(answer, list);
            if (memberPos != -1) {
                LocalDate today = LocalDate.now();
                LocalDate aYearAgo = today.minusYears(1);
                LocalDate lastPayment = LocalDate.parse(list[memberPos + 1]);
                if (lastPayment.isBefore(aYearAgo) || lastPayment.equals(aYearAgo)) {
                    JOptionPane.showMessageDialog(null, list[memberPos] + " har tidigare varit medlem");
                } else {
                    String[] activeMember = list[memberPos].split(", ");
                    checkIn(activeMember[0], activeMember[1], "bestPT.txt");
                    JOptionPane.showMessageDialog(null, list[memberPos] + " är nuvarande medlem");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Har aldrig varit medlem");
            }
        } catch (IOException e) {
            System.out.println("Its a error in the system");
        }
    }

    private static int findMember(String member, String[] list) {
        for (int i = 0; i < list.length; i++) {
            if (i % 2 == 0) {
                String[] currentMember = list[i].split(", ");
                if (currentMember[0].equals(member.trim()) || currentMember[1].equalsIgnoreCase(member.trim())) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static void checkIn(String iD, String name, String fileName) throws IOException {
        String s;
        String content = "";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while ((s = br.readLine()) != null) {
            content += s + "\n";
        }
        try (PrintWriter outstream = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));) {
            File file2 = new File(fileName);
            String saveData = iD + " " + name + " " + LocalDate.now();
            content += saveData + "\n";
            outstream.append(content);
        }
    }

}
