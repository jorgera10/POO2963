/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import ec.espe.edu.Singleton.model.Singleton;

/**
 *
 * @author H304
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Singleton personName = Singleton.getSingletonInstance("Adrian Mosquera");
        Singleton personName1 = Singleton.getSingletonInstance("Jorge Ramos");

        System.out.println(personName.getName());
        System.out.println(personName1.getName());
    }

}
