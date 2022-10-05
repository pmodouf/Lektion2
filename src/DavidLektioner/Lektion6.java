package DavidLektioner;

import java.io.IOException;
import java.util.Arrays;

public class Lektion6 { public static void main(String[] args)throws IOException{
    String[] javaCourse = {"Johanna", "Frida", "David", "Fredrik", "Anton"};
    String[] cSharp = {"David", "Greger", "Robert", "Lisa", "Okänd"};
    String[] javaScriptCourse = {"Hip", "Johanna", "asdasd", "Lisa", "asdasd"};
    System.out.println(Arrays.toString(javaCourse));
    System.out.println(Arrays.toString(cSharp));
    System.out.println(Arrays.toString(javaScriptCourse));

    String[][] allClasses = new String[3][5];
    allClasses[0] = javaCourse;
    allClasses[1] = cSharp;
    allClasses[2] = javaScriptCourse;
    System.out.println(Arrays.deepToString(allClasses));


}
}
