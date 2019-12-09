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
public class G extends C {

    private I i;

    public G(I i) {
        this.i = i;
    }
    
    

    @Override
    public String toString() {
        return "G{" + "i=" + i + '}';
    }

    public void print() {
        System.out.println("Imprimiendo desde G");
    }

}
