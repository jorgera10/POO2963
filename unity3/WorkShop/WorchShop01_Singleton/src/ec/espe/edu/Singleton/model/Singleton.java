/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Singleton.model;


/**
 *
 * @author H304
 */
public class Singleton {
    
    private String name;
    private static Singleton singleton;

    public Singleton(String name) {
        this.name = name;
        System.out.println("Mi nombre es: "+this.name );
    }
    public static Singleton getSingletonInstance(String name){
        if(singleton == null){
            singleton = new Singleton (name);
        }else {
            System.out.println("No puedes crear el objeto "+name+ " porque ya existe un objeto");
        }
        return singleton;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void setSingleton(Singleton singleton) {
        Singleton.singleton = singleton;
    }
    
            
    
    
    
}
