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
public class Swallow extends Bird{
    private boolean sings;

    @Override
    public String toString() {
        return "Swallow{" + "sings=" + sings + '}';
    }
    
    

    public Swallow(int id, String name, String gender, float weight, Cage cage, boolean sings) {
        super(id, name, gender, weight, cage);
        this.sings = sings;
    }

    public boolean isSings() {
        return sings;
    }

    public void setSings(boolean sings) {
        this.sings = sings;
    }

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    public boolean isFlie() {
        return flie;
    }

    public void setFlie(boolean flie) {
        this.flie = flie;
    }
    
    
    
    
}
