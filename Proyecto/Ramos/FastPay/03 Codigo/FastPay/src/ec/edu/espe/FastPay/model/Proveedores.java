/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.model;

import java.io.*;

/**
 *
 * @author Lenovo
 */
public class Proveedores {
    
    public String leerTxt(String direccion){
        String texto = " \n ";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "\n";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
            
                temp = temp + bfRead;
            }
            texto = temp;
        
        }catch(Exception e){
            System.err.println("No se encontro el archivo");
        }
        
        return texto+ "\n";
    }
    
}
