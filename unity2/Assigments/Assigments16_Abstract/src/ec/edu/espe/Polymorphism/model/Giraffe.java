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
public class Giraffe extends Mamal{
    private int tailLenght; 

    public Giraffe(int tailLenght, boolean IsBreastFeeding, int id, String name, String gender, float weight, Cage cage) {
        super(IsBreastFeeding, id, name, gender, weight, cage);
        this.tailLenght = tailLenght;
    }

    @Override
    public String toString() {
        return "Giraffe{" + "tailLenght=" + getTailLenght() + '}';
    }

    /**
     * @return the tailLenght
     */
    public int getTailLenght() {
        return tailLenght;
    }

    /**
     * @param tailLenght the tailLenght to set
     */
    public void setTailLenght(int tailLenght) {
        this.tailLenght = tailLenght;
    }
    
   
    
}
