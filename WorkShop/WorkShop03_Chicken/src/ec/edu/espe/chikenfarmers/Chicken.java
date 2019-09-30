
package ec.edu.espe.chikenfarmers;

/**
 *
 * @author Lenovo
 */

public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private String setName;
    
    public void doStuff(int forTime){
        System.out.println("My Chicken " + name + " is doing thins");
        
        cluck();
        wander();
        eat();
        drink();
        poop();
        cluck();
        drink();
        
    }
    
    private void cluck(){
        System.out.println("cluck cluck cluck");
    }
    
    private void wander(){
        System.out.println(name + " is wondering");
    }
    
    private void eat(){
        System.out.println(name + " is eating");
    }
    
    private void drink(){
        System.out.println(name + " is drinking water");
    }
    
    private void poop(){
        System.out.println(name + " is pooping");
    }
    
    private Egg layAnEag(){
        return new Egg();
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    
}
    
    

