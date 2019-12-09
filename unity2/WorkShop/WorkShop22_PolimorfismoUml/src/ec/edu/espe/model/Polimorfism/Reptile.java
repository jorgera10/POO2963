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
public class Reptile extends Animal {
    
    private boolean extremities;


    public Reptile(boolean extremities, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        this.extremities = extremities;
    }

    @Override
    public String toString() {
        return "Reptile{" + "extremities = " + extremities + '}';
    }
    

    /**
     * @return the extremities
     */
    public boolean isExtremities() {
        return extremities;
    }

    /**
     * @param extremities the extremities to set
     */
    public void setExtremities(boolean extremities) {
        this.extremities = extremities;
    }
   
    
}
