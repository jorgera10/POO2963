
package ec.edu.espe.model;

/**
 *
 * @author Lenovo
 */
public class Bird extends Animal {
    /**
     * the whing size in milimeters
     */
    int wingSize;
    /**
     *  true if it flies, false if it flies
     */
    boolean flie;

    public Bird(int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
    }
}
