package DavidLektioner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lektion6ov1 { public static void main(String[] args)throws IOException {
    Scanner scanner = new Scanner(System.in);
            String[] names = new String[1000];
            int counter = 0;
            while(scanner.hasNext()){
                String input = scanner.nextLine();
                        names[counter] = input;
                        counter++; }
            System.out.println(Arrays.toString(names));

}
}
