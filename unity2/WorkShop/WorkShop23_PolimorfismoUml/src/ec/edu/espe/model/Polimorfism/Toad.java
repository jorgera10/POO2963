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
public class Toad extends Amphibian{
    
    private boolean poisonous;

    public Toad(boolean poisonous, boolean tail, int id, String name, String gender, float weight, Cage cage) {
        super(tail, id, name, gender, weight, cage);
        this.poisonous = poisonous;
    }

    @Override
    public String toString() {
        return "Toad{" + "poisonous = " + poisonous + '}';
    }
    

    /**
     * @return the poisonous
     */
    public boolean isPoisonous() {
        return poisonous;
    }

    /**
     * @param poisonous the poisonous to set
     */
    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }
    
    
    
}
