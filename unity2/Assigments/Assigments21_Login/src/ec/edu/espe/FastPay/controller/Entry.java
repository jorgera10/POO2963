/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Entry {
    
    ArrayList<Entry> entry = new ArrayList<Entry>();
    
    Scanner enter = new Scanner (System.in);
    
    private int id_article;
    private String data;
    char reply;
    
    public void enter(){
        
        Entry ent = new Entry();
        
        do{
            System.out.print("Enter article ID: ");
            id_article = enter.nextInt();
            System.out.print("Do you want to enter another article? (Yes/No): ");
            reply = enter.next().charAt(0);
            System.out.println("");
            
        }while(reply == 'y' || reply == 'Y');
        
        entry.add(ent);
        
        try{
            PrintWriter pw = new PrintWriter("Archivo.txt");
            pw.write("nose");
            pw.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    } 
    
    
    public static void modify(){
        
    }
    public static void delete(){
        
    }
    public static void see(){
        
    }
}
