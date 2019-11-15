/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.classrelations.view;

import ec.edu.espe.classrelations.controller.A;
import ec.edu.espe.classrelations.controller.C;
import ec.edu.espe.classrelations.model.D;

/**
 *
 * @author Edison Lascano
 */
public class ClassRelations {


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a1;
        C c;
        D d;
        
        a1 = new A();
        c = new C();
        d = new D();

        d = a1.m(c);
        
        System.out.println("calling method A.m() --> " + a1.m(c));


        System.out.println("calling method A.m() --> " + d);
        
        
        
    }
    
}
