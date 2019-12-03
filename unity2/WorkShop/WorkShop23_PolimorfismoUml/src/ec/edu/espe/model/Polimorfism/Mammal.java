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
public class Mammal extends Animal {
    
    private boolean isBreastFeeling;

    public Mammal(boolean isBreastFeeling, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        System.out.println("Mammal constructor");
        this.isBreastFeeling = isBreastFeeling;
    }

    @Override
    public String toString() {
        return "Mammal{" + "isBreastFeeling=" + isBreastFeeling + '}';
    }
    
    

    /**
     * @return the isBreastFeeling
     */
    public boolean isIsBreastFeeling() {
        return isBreastFeeling;
    }

    /**
     * @param isBreastFeeling the isBreastFeeling to set
     */
    public void setIsBreastFeeling(boolean isBreastFeeling) {
        this.isBreastFeeling = isBreastFeeling;
    }
    
}
