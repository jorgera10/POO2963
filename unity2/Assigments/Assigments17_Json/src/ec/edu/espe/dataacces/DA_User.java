/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dataacces;

import ec.edu.espe.entity.User;
import org.json.simple.JSONArray;



public class DA_User {
    
    public JSONArray arrayUsers(){
        JSONArray arr = new JSONArray();
            arr.add(new User(1, "Geo", "123"));
            arr.add(new User(2, "Nath", "587"));
            arr.add(new User(3, "Gath", "697"));
            
        return arr;
    }
    
}
