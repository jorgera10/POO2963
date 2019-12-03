/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.Polimorfism;

/**
 *
 * @author HP
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cage cage = new Cage(1, "wood", 1, 1);
        Animal animal1 = new Animal (1, "Pepito", "Male", 5, cage);
        Animal animal2 = new Animal (2, "Juana", "Female", 4, cage);
        Animal animal3 = new Animal (3, "Sapin", "Male", 2, cage);
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        
    }
    
}
