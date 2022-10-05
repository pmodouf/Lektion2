package DavidLektioner;

public class bokTest { public static void main(String[] args){
    Boken nyBok = new Boken();
    nyBok.antalSidor = 10;
    nyBok.forfattare = "zlatan";
    nyBok.pris =100 ;
    nyBok.titel ="hejhej" ;


   Boken nyBok2 = new Boken();
   nyBok2.antalSidor = 100;
   nyBok2.forfattare = "Harry";
   nyBok2.pris = 105;
   nyBok2.titel = "Arsenal";
    System.out.println(nyBok2.antalSidor+"\n"+nyBok2.forfattare+"\n"+ nyBok2.pris+"\n"+nyBok2.pris+"\n"+nyBok2.titel);

}}
