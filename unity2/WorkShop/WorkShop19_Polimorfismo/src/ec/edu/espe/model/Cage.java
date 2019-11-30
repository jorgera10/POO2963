
package ec.edu.espe.model;

/**
 *
 * @author Lenovo
 */
class Cage {
    private String material;
    private int Xposition;
    private int Yposition;

    @Override
    public String toString() {
        String cagge = String.valueOf(material, Xposition, Yposition);
        cagge += super.toString();
        return cagge;
    }

    public Cage(String material, int Xposition, int Yposition) {
        this.material = material;
        this.Xposition = Xposition;
        this.Yposition = Yposition;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getXposition() {
        return Xposition;
    }

    public void setXposition(int Xposition) {
        this.Xposition = Xposition;
    }

    public int getYposition() {
        return Yposition;
    }

    public void setYposition(int Yposition) {
        this.Yposition = Yposition;
    }
}
