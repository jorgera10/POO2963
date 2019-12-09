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
public abstract class F extends C{
    
    private K k;

    public F(K k) {
        this.k = k;
    }
    
    
    @Override
    public String toString() {
        return "F{" + "k=" + k + '}';
    }
    
    public void print(){
        System.out.println("Imprimiendo desde F");
    }
    
    
}
