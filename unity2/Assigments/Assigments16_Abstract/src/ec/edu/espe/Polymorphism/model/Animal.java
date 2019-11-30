/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Polymorphism.model;

/**
 *
 * @author Lenovo
 */
public abstract class Animal {

    private int id;
    private String name;
    private String gender;
    private float weight;
    private Cage cage;

    public abstract String getData(); 
    
    public Animal(int id, String name, String gender, float weight, Cage cage) {
        System.out.println("Animal Constructor");
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.cage = cage;
    }

    
public String toString(){
    String animal;
    animal = id + ", " + gender + ", " + name + ", " + weight + ", " + cage;
    return animal; 
}


public boolean Feed(){
    return true; 
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the Cage
     */
    public Cage getCage() {
        return cage;
    }

    /**
     * @param cage the Cage to set
     */
    public void setCage(Cage cage) {
        this.cage = cage;
    }

}
