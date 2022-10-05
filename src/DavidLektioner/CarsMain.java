package DavidLektioner;

import DavidLektioner.Cars;

public class CarsMain {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        car1.licensPlate = "ABC111";
        car1.fabric = "Volvo";
        car1.manifactured = 1992;
        car1.curbWeight = 1001.1;
        car1.motor = 2000;
        car1.owner1 = "David";
        car1.fordonsSkatt = 1.5; 

        System.out.println(car1.owner1 + "\n" + car1.licensPlate + "\n" + car1.fabric + "\n" + car1.manifactured + "\n" + car1.curbWeight
                + "\n" + car1.motor+"\n"+ "Fordonsskatt="+ car1.curbWeight*car1.fordonsSkatt);

        car2.fordonsSkatt= 1.5;
        car2.licensPlate = "ART201";
        car2.fabric = "Saab";
        car2.manifactured = 1991;
        car2.curbWeight = 1000;
        car2.motor = 1000;
        car2.owner2 = "Danne";
        System.out.println(car2.owner2 + "\n" + car2.licensPlate + "\n" + car2.fabric + "\n" + car2.manifactured + "\n" + car2.curbWeight + "\n" + car2.motor
        +"\n"+ "Fordonsskatt="+car2.curbWeight*car2.fordonsSkatt);


    }
}