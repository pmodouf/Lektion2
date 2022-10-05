package Övning2;

import Övning2C.Övn2C;

public abstract class  Fordon implements Övn2C {
   private int hastighet;
   private int vikt;

   public int getHastighet() {
      return hastighet;
   }

   public int getVikt() {
      return vikt;
   }

   public void ändraHastighet(int nyHastighet) {
      hastighet = nyHastighet;

   }
   public Fordon(int hastighet, int vikt) {
      this.hastighet = hastighet;
      this.vikt = vikt;
   }


   abstract public void printMe();

   abstract public void hjulBuren();


}

