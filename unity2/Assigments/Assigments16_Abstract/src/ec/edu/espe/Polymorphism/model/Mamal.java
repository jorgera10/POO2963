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
public class Mamal extends Animal {

    private boolean IsBreastFeeding;

    public Mamal(boolean IsBreastFeeding, int id, String name, String gender, float weight, ec.edu.espe.Polymorphism.model.Cage cage) {
        super(id, name, gender, weight, cage);
        System.out.println("Mamal Constructor");
        this.IsBreastFeeding = IsBreastFeeding;
    }

    @Override
    public String toString() {
        String mamal; 
         mamal= "Mamal{" + "IsBreastFeeding=" + IsBreastFeeding + '}';
         return mamal;
    }

    /**
     * @return the IsBreastFeeding
     */
    public boolean isIsBreastFeeding() {
        return IsBreastFeeding;
    }

    /**
     * @param IsBreastFeeding the IsBreastFeeding to set
     */
    public void setIsBreastFeeding(boolean IsBreastFeeding) {
        this.IsBreastFeeding = IsBreastFeeding;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
