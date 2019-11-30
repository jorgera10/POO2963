
package ec.edu.espe.model;

/**
 *
 * @author Lenovo
 */
public class Mamal extends Animal{
    
    private boolean isBreastFeeding;

    @Override
    public String toString() {
        String mammal;
        mammal = String.valueOf(isBreastFeeding) + ",";
        mammal += super.toString();
        return mammal;
    }

    
    public Mamal(int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        this.isBreastFeeding = isBreastFeeding;
    }

    /**
     * @return the isBreastFeeding
     */
    public boolean isIsBreastFeeding() {
        return isBreastFeeding;
    }

    /**
     * @param isBreastFeeding the isBreastFeeding to set
     */
    public void setIsBreastFeeding(boolean isBreastFeeding) {
        this.isBreastFeeding = isBreastFeeding;
    }
    
}
