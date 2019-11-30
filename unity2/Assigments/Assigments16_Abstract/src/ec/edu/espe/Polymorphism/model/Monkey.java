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
public class Monkey extends Mamal {

    private int tailLength;

    public Monkey(int tailLength, boolean IsBreastFeeding, int id, String name, String gender, float weight, ec.edu.espe.Polymorphism.model.Cage cage) {
        super(IsBreastFeeding, id, name, gender, weight, cage);
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Monkey{" + "tailLength=" + tailLength + '}';
    }

    /**
     * @return the tailLength
     */
    public int getTailLength() {
        return tailLength;
    }

    /**
     * @param tailLength the tailLength to set
     */
    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }
}
