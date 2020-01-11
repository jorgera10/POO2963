/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.controller;

import com.google.gson.Gson;
import ec.edu.espe.FastPay.Library.FileLibrary;
import ec.edu.espe.library.PasswordLibrary;
import java.util.ArrayList;
import ec.edu.espe.FastPay.model.user1;

/**
 *
 * @author Usuario
 */
public class Usercontrol {
    private final Gson gson = new Gson();
    public user1 Validate(String username, String password){
        ArrayList<Object> objects;
        ArrayList<user1> users =new ArrayList<>();
        objects = FileLibrary.readyObject(user1.class.getSimpleName());
        user1 user = null;
        for(int i=0;i<objects.size();i++){
            user1 userJson;
            String jUser = gson.toJson(objects.get(i));
            userJson = gson.fromJson(jUser, user1.class);
            
            users.add(userJson);
            
        }
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUserName().equals(username)&&PasswordLibrary.decryptPass(users.get(i).getPassword()).equals(password)){
                user = users.get(i);
            }
        }
        return null;
        
        
        
    }
    
}
