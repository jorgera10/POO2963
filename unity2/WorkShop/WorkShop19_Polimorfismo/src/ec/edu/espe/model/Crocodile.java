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
public class Crocodile extends Reptil {
    private boolean shedSkin;

    @Override
    public String toString() {
        return "Crocodile{" + "shedSkin=" + shedSkin + '}';
    }

    public Crocodile(int id, String name, String gender, float weight, Cage cage, boolean shedSkin) {
        super(id, name, gender, weight, cage);
        this.shedSkin = shedSkin;
    }

    public boolean isShedSkin() {
        return shedSkin;
    }

    public void setShedSkin(boolean shedSkin) {
        this.shedSkin = shedSkin;
    }
    
    
    
}
