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
public class Monkey extends Mamal {

    private int tailSize;

    @Override
    public String toString() {
        String monkey;
        monkey = String.valueOf(tailSize) + ",";
        monkey += super.toString();
        return monkey;
    }
    
    

    /**
     * @return the tailSize
     */
    public int getTailSize() {
        return tailSize;
    }

    /**
     * @param tailSize the tailSize to set
     */
    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
    }
    
    
    public Monkey(int id, String name, String gender, float weight, Cage cage, int tailSize) {
        super(id, name, gender, weight, cage);
        this.tailSize = tailSize;
    }


    
}
