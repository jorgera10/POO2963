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
public class Clownfish extends Fish{
    
    private int size;

    @Override
    public String toString() {
        return "Clownfish{" + "size=" + size + '}';
    }

    public Clownfish(int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

}
