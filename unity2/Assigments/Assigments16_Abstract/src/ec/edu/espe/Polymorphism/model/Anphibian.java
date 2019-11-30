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
public class Anphibian extends Animal{
    
    private boolean liveinWater;

    public Anphibian(boolean liveinWater, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        this.liveinWater = liveinWater;
    }

    @Override
    public String toString() {
        return "Anphibian{" + "liveinWater=" + isLiveinWater() + '}';
    }

    /**
     * @return the liveinWater
     */
    public boolean isLiveinWater() {
        return liveinWater;
    }

    /**
     * @param liveinWater the liveinWater to set
     */
    public void setLiveinWater(boolean liveinWater) {
        this.liveinWater = liveinWater;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
          
}
