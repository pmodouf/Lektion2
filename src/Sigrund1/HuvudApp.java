package Sigrund1;

public class HuvudApp {
    public static void main(String[] args) {
       Owner pa = new Owner("Pa","Odenplan",10);
       Bil car1 = new Bil("1000","Tesla","Tesla",pa);
        /**/

        Owner oumar = new Owner("Oumar","Helsingfors",20);
        Bil car2 = new Bil("10000","Fiat","Firre",oumar);
        /*System.out.println(car2.owner.getName());
        System.out.println(car2.getModell());
        System.out.println(car2.getReg());*/

        car2.såld(pa);
        System.out.println(car2.getOwner().getName());
        System.out.println(car2.getModell());
        System.out.println(car2.getReg());


        car1.såld(oumar);
        System.out.println(car1.getOwner().getName());
        System.out.println(car1.getModell());
        System.out.println(car1.getReg());


    }
}
