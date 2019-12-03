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
public class Ostrich extends Bird {

    /**
     * The running speed will be expressed in meters over second (m/s)
     */
    private int runningSpeed;

    public Ostrich(int runningSpeed, int wingSize, boolean fly) {
        super(wingSize, fly);
        this.runningSpeed = runningSpeed;
    }

    @Override
    public String toString() {
        return "Ostrich{" + "runningSpeed = " + runningSpeed + "(m/s)" + '}';
    }

    /**
     * @return the runningSpeed
     */
    public int getRunningSpeed() {
        return runningSpeed;
    }

    /**
     * @param runningSpeed the runningSpeed to set
     */
    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

}
