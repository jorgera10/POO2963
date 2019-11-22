
package ec.edu.espe.model;

/**
 *
 * @author Lenovo
 */
public class Person {
    private String name;
    private String lastName;
    int year;

    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int edad) {
        this.year = edad;
    }
   
}
