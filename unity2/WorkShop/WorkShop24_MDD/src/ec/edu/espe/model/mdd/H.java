/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.mdd;

/**
 *
 * @author HP
 */
public abstract class H extends C {

    private J j;

    public H(J j) {
        this.j = j;
    }
    
    
    @Override
    public String toString() {
        return "H{" + "j=" + j + '}';
    }

    public void print() {
        System.out.println("Imprimiendo desde H");
    }

}
