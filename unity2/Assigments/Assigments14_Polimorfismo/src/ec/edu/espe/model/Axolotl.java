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
public class Axolotl extends Amphibian{
    private boolean melanin;

    @Override
    public String toString() {
        return "Axolotl{" + "melanin=" + melanin + '}';
    }
    
    public Axolotl(int id, String name, String gender, float weight, Cage cage, boolean melanin) {
        super(id, name, gender, weight, cage);
        this.melanin = melanin;
    }

    public boolean isMelanin() {
        return melanin;
    }

    public void setMelanin(boolean melanin) {
        this.melanin = melanin;
    }
    
    
}
