/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chickenfarmers.view;

import ec.edu.espe.chickenfarmers.model.Chicken;

/**
 *
 * @author Edison Lascano
 */
public class ChikenFarmers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Chicken chicken = new Chicken();
        chicken.setName("Lucy");
        
        chicken.doStuff(0);
        
        Chicken[] chickens;       
    }
}
