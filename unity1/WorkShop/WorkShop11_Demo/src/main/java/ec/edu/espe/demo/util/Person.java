
package ec.edu.espe.demo.util;


public class Person{
    private String name;
    private int age; 
    private String dni;
    
    public Person(){

    }

    public Person(String name, int age, String dni){
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}