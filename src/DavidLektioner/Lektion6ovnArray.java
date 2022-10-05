package DavidLektioner;

import java.util.Arrays;

public class Lektion6ovnArray { public static void main(String[] args){
    String[] books = {"Harry Potter","Narnia","Zlatan"};
    System.out.println(books[0]);
    System.out.println(books[2]);
    Arrays.sort(books);
    System.out.println(Arrays.toString(books));
    System.out.println(books.length);

    int nyBok = books.length;
    String nyaste[] = new String [nyBok+1];
    int varde = 3;
    System.out.println(Arrays.toString(books));
    for(int i=0;i<nyBok;i++){
        nyaste[i] = books[i];}
      nyaste[nyBok] = "Kalle Anka";
        System.out.println(Arrays.toString(nyaste));














}
}
