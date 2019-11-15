/** Copyright ESPE-DECC
*/

package ec.edu.espe.chickenfarmers.model;

/**
 *
 * @author Edison Lascano
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    
    public void doStuff(int forTime){
        System.out.println("My chicken " + getName() + " is doing things");
        cluck();
        wander();
        eat();
        drink();
        poop();
        cluck();
        cluck();
        drink();
    }
    
    private void cluck(){
        System.out.println("Cluck cluck cluck");
    }
    
    private void wander(){
        System.out.println(getName() + " is wandering");
    }
    
    private void eat(){
        System.out.println(getName() + " is eating");
    }
    
    private void drink(){
        System.out.println(getName() + "is drinking water");
    }
    
    private void poop(){
        System.out.println(getName() + " is pooping");
    }
    
    private Egg layAnEgg(){
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
