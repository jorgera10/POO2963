/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Lenovo
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Cage cage = new Cage("Hierro",1,1);
        
        System.out.println("\n---MAMAL---");
        Animal animal = new Animal(1, "pepito", "masculino", 5, cage);
        System.out.println(animal);
        
        Animal animal2 = new Animal(2, "Balto", "masculino", 10, cage);
        System.out.println(animal2);
        
        System.out.println("\n---FISH---");
        
        Cage cage2 = new Cage("lagos",2,1);
        Animal animal3 = new Animal(3, "nemo", "masculino", 2, cage2);
        System.out.println(animal3);
        
        Animal animal4 = new Animal(4, "rose", "hembra", 2, cage2);
        System.out.println(animal4);
        
        System.out.println("\n---BIRD---");
        Cage cage3 = new Cage("Hierro",3,1);
        
        Animal animal5 = new Animal(5, "Pidgcy", "macho", 1, cage3);
        System.out.println(animal5);
        
        Animal animal6 = new Animal(6, "Zubat", "hembra", 1, cage3);
        System.out.println(animal6);
        
        System.out.println("\n---REPTIL---");
        Cage cage4 = new Cage("Hierro",1,2);
        
        Animal animal7 = new Animal(7, "Charizar", "macho", 10, cage4);
        System.out.println(animal7);
        
        Animal animal8 = new Animal(8, "Cranidos", "hembra", 20, cage4);
        System.out.println(animal8);
        
        System.out.println("\n---AMPHIBIAN---");
        
        Cage cage5 = new Cage("lagos",1,3);
        
        Animal animal9 = new Animal(9, "Frogadier", "macho", 10, cage4);
        System.out.println(animal9);
        
        Animal animal10 = new Animal(10, "Sixer", "hembra", 20, cage4);
        System.out.println(animal10);
        
    }
    
}
