/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Polymorphism.model;

/**
 *
 * @author STALIN RIVERA
 */
public class Piranha extends Fish{
    private int size;

    @Override
    public String toString() {
        return "Piranha{" + "size=" + size + '}';
    }

    public Piranha(int id, String name, String gender, float weight, Cage cage, int size) {
        super(id, name, gender, weight, cage);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
