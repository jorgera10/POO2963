
package ec.edu.espe.student.model;

import java.io.*;
import java.util.Scanner;

/*
 @author Jorge Ramos y Mathyws Rodriguez
 */
public class Estudent {
    public static void main(String[] args) {
 
        
        String name, last_name;
        int number;
        int resultado = 0;
        float prom = 0; 
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        Scanner reader = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        int opcion;
        Scanner enter= new Scanner(System.in);
                Scanner obtener = new Scanner(System.in);

        int notas;
    
        File estudiante = new File ("Estudent.csv");
        do{
            
        
        System.out.println("------Options------ ");
        System.out.println("1.- Enter");
        System.out.println("2.- Show");
        System.out.println("3.- Exit");
        
        opcion = read.nextInt();
        
        
        switch(opcion)
        {
            case 1:
                System.out.println("Enter data ");
    if(!estudiante.exists()){
        try {
            estudiante.createNewFile();
            System.out.println("Type a name: ");
            name = enter.next();
            System.out.println("Type a last name: ");
            last_name = enter.next();   
            System.out.print("Enter the grade:");
            notas = enter.nextInt();
            System.out.print("Enter the number of numbers to add: ");
           
                System.out.print("Enter number of phone: ");
                number = enter.nextInt();
                            
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + name );
                mostrar.println("Last name: " + last_name );
                mostrar.println("Number: " + number);
                mostrar.println("Avarage: " + prom);
                System.out.println("The avarage is: " + prom);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
                
            System.out.print("Type a name: ");
            name = enter.next();
            System.out.print("Type a last name: ");
            last_name = enter.next();            
            System.out.print("Enter a card number: ");
            number = enter.nextInt();
            System.out.print("Enter grade 1:");
            nota1 = enter.nextInt();
            System.out.print("Enter grade 2:");
            nota2 = enter.nextInt();
            System.out.print("Enter grade 3:");
            nota3 = enter.nextInt();
            resultado = nota1+nota2+nota3; 
            System.out.println("The sum of  " + nota1 + " + " + nota2 +  " + " + nota3 + " = " + resultado);
            prom= resultado / 3;     
            System.out.println("The avarage of  " + nota1 + " + " + nota2 +  " + " + nota3 + " is =  " + prom);
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("Name: "+ name);
                mostrar.println("Last name: "+ last_name);
                mostrar.println("Number: "+ number);
                mostrar.println("Avarage:"+ prom);
                 if(prom>= 7){
                System.out.print("APPROVED");

            }else{
                 System.out.print("DESAPPROVED");
            }
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
                
                
                
                break;
                
            case 2:
                System.out.println("Show data");
                
            default :
                System.out.println("Invalid option");
                break;
        }
        
        }while(opcion !=3);
    }
    
}
