
package ec.edu.espe.chickenfarmers.view;

import ec.edu.espe.chikenfarmers.Chicken;

/**
 *
 * @author Jorge
 */


public class Chickenfarmers {

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        
        
        
        System.out.println("\tFarmer 1:\n");
        chicken.setName ("Lucy");
        chicken.doStuff(0);
        System.out.println("");
         chicken.setName ("Aliss");
        chicken.doStuff(1);
        System.out.println("");
         chicken.setName ("Carlita");
        chicken.doStuff(2);
        System.out.println("");
         chicken.setName ("Sofi");
        chicken.doStuff(3);
        System.out.println("");
         chicken.setName ("Joss");
        chicken.doStuff(4);
        System.out.println("");
        
        System.out.println("\n\tFarmer 2:\n ");
        
        chicken.setName ("Carol");
        chicken.doStuff(5);
        System.out.println("");
         chicken.setName ("Juana");
        chicken.doStuff(6);
        System.out.println("");
         chicken.setName ("Darme");
        chicken.doStuff(7);
        System.out.println("");
         chicken.setName ("Katy");
        chicken.doStuff(8);
        System.out.println("");
         chicken.setName ("Brit");
        chicken.doStuff(9);
    }
    
}
