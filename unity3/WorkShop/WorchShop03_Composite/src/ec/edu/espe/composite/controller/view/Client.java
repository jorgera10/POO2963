/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.composite.controller.view;

import ec.edu.espe.composite.controller.Component;
import ec.edu.espe.composite.controller.Composite;
import ec.edu.espe.composite.controller.Leaf;

/**
 *
 * @author camyt
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.Add(new Leaf("A"));
        root.Add(new Leaf("B"));
        Composite comp = new Composite("composite x");
        comp.Add(new Leaf("XA"));
        comp.Add(new Leaf("XB"));
        root.Add(comp);
        root.Add(new Leaf("C"));
        Leaf leaf =  new Leaf("D");
        root.Add(leaf);
        root.Remove(leaf);
        root.Show(1);
        
       
        
        
    }
}
