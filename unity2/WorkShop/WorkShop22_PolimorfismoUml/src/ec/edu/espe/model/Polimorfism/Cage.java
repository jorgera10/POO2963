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
class Cage {
    
    private int id;
    private String material;
    private int xPosition;
    private int yPosition;

    public Cage(int id, String material, int xPosition, int yPosition) {
        this.id = id;
        this.material = material;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    @Override
    public String toString() {
        return "Cage{" + "id = " + id + ", material = " + material + ", xPosition = " + xPosition + ", yPosition = " + yPosition + '}';
    }

  

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the xPosition
     */
    public int getxPosition() {
        return xPosition;
    }

    /**
     * @param xPosition the xPosition to set
     */
    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * @return the yPosition
     */
    public int getyPosition() {
        return yPosition;
    }

    /**
     * @param yPosition the yPosition to set
     */
    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}
