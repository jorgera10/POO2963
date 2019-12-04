package ec.edu.espe.FastPay.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Administrator {
    private int dni;
    private String name;
    private String Last_Name;
    private String user;
    private String password;
    public static void User_create(){
        int dni = 0;
        String name = null, Last_Name = null, user = null, password = null;
        
        Scanner read = new Scanner(System.in);
        int opcion;
        Scanner enter= new Scanner(System.in);
        File User = new File ("User.csv");
        do{
            
        
        System.out.println("****Menu de opciones**");
        System.out.println("1.- Create");
        System.out.println("2.- Show");
        System.out.println("3.-Exit");
        
        opcion = read.nextInt();
        
        
        switch(opcion)
        {
            case 1:
                System.out.println("Please, input the data");
    if(!User.exists()){
        try {
            System.out.println("Enter el dni for create el user: ");
            dni = enter.nextInt();
            System.out.println("Type the name: ");
            name = enter.nextLine();
            System.out.println("Type the Lastname: ");
            Last_Name = enter.nextLine();
            System.out.println("Enter un user for create the user: ");
            user = enter.toString();
            System.out.println("Enter a passworrd: ");
            password = enter.nextLine();
                    
                         
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(User, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Dni: " + dni);
                mostrar.println("Name: " + name );
                mostrar.println("Lastname: " + Last_Name);
                mostrar.println("User: " + user);
                mostrar.println("Password: " + password);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
              
            System.out.println("Enter your dni to create a user: ");
            dni = enter.nextInt();
            System.out.println("Type the name: ");
            name = enter.nextLine();
            System.out.println("Type the Lastname: ");
            Last_Name = enter.nextLine();
            System.out.println("Enter username to create your user: ");
            user = enter.toString();
            System.out.println("Enter a password: ");
            password = enter.nextLine();
            
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(User, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("Dni: " + dni);
                mostrar.println("Name: " + name );
                mostrar.println("Lastname: " + Last_Name);
                mostrar.println("User: " + user);
                mostrar.println("Password: " + password);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
                
                
                
                break;
                
            case 2:
                System.out.println("Muestra los datos");
                
            default :
                System.out.println("Selecion una opcion");
                System.out.println("");
                System.out.println("Dni: " + dni);
                System.out.println("Name: " + name);
                System.out.println("Lastname: " + Last_Name);
                System.out.println("User: " + user);
                System.out.println("Password: " + password);
                
                break;
        }
        
        }while(opcion !=3);
    

    

    
}
    public static void User_delete(){
    
        
    } 
}
