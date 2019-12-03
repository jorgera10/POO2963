/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenceparameter;

import sun.nio.cs.ext.GB18030;

/**
 *
 * @author Lenovo
 */
public class ReferenceParameter {

    static int p = 5;
    static int q = 5;
    
    public static void main(String[] args) {
    
        ReferenceParameter RP = new ReferenceParameter();
        
        System.out.println("before calling method ");
        System.out.println("p --> " + p);
        System.out.println("q --> " + q);

        
        int r=0;
        r = sum(p,q);
        
        System.out.println("after callig method");
        System.out.println("p --> " + p);
        System.out.println("q --> "+ q);
        System.out.println("result -->"+r);
        
        Person person = new Person(1, "Jorge");
        System.out.println("before calling the method -> " + person);
        viewName(person);
        System.out.println("after calling the method" + person);
        
        Gson gson = new Gson();
        
        String JsonString = gson.toJeson(person);
        System.out.println("json --> " + jsonString);
        
        String json2 = "\"id\": 100, \"name\":\"Daniel\"}";
        
        System.out.println(" json2 --> " + json2);
        
        Person pp = gson.fromJon(json2, Person.class);
        System.out.println("pp --> "+pp);
    
    }
    
    public static int sum(int a, int b){
        a = 20;
        b = 30;
        int c;
        c = a + b;
        return c;
    }
    
    public static void viewName(Person p){
        System.out.println(" person at first line of method -> "+p);
        p.setId(10);
        p.setName("Jorge");
        System.out.println(" person at last line --> "+p);
    }
    
}
