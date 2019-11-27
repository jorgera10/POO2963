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
public class Pigeon extends Bird {
    
    private boolean fly;

    @Override
    public String toString() {
        return "Pigeon{" + "fly=" + fly + '}';
    }

    public Pigeon(int id, String name, String gender, float weight, Cage cage, boolean fly) {
        super(id, name, gender, weight, cage);
        this.fly = fly;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
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
