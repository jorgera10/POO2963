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
public class Amphibian extends Animal {
    
    private boolean tail;

    public Amphibian(boolean tail, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Amphibian{" + "tail = " + tail + '}';
    }
    

    /**
     * @return the tail
     */
    public boolean isTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(boolean tail) {
        this.tail = tail;
    }
    
}
