
package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Student extends Person {
    
    Scanner enter = new Scanner(System.in);
    
    private float score;
    private int IDstudent;
    
    public Student(String name, String lastName, int year, float score, int IDstudent  ){
        super (name, lastName, year);
        
        this.score = score;
        this.IDstudent = IDstudent;
    }
    
    public void Print(){
        System.out.println("Name: "+ getName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Years: " + getYear());
        System.out.println("Score: " + score);
        System.out.println("Id student: " + IDstudent);
    }
    
}
