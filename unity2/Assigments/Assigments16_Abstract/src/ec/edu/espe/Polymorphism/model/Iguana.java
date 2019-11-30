/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Polymorphism.model;

/**
 *
 * @author Jorge Ramos
 */
public class Iguana extends Reptil{
   private int age; 

    @Override
    public String toString() {
        return "Iguana{" + "age=" + age + '}';
    }

    public Iguana(int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

   
}
