
package ec.edu.espe.model;

/**
 *
 * @author Lenovo
 */
public class Wolf extends Mamal {
    private String color;

    @Override
    public String toString() {
        return "Wolf{" + "color=" + color + '}';
    }
    
    public Wolf(int id, String name, String gender, float weight, Cage cage, String color) {
        super(id, name, gender, weight, cage);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
