/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.Polimorfism;

/**
 *
 * @author HP
 */
public class Bird {
    
    /**
     * The wing size in milimeters
     */
    
    private int wingSize;

    public Bird(int wingSize, boolean fly) {
        this.wingSize = wingSize;
        this.fly = fly;
    }
    
    /**
     * True = Fly
     * False = Not fly
     */
    private boolean fly;

    /**
     * @return the wingSize
     */
    public int getWingSize() {
        return wingSize;
    }

    /**
     * @param wingSize the wingSize to set
     */
    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    /**
     * @return the fly
     */
    public boolean isFly() {
        return fly;
    }

    /**
     * @param fly the fly to set
     */
    public void setFly(boolean fly) {
        this.fly = fly;
    }
}
