/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.model.Student;

/**
 *
 * @author Lenovo
 */
public class Principal {
    public static void main(String [] args){
        Student student = new Student("Jorge", "Ramos", 18, 14.5f, 8125 );
    
        student.Print();
    }
}
